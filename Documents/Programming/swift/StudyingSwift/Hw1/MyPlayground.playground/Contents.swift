import Foundation

class Diary
{
    let date: Date
    var name: String? = nil
    {
        didSet(oldValue)
        {
            print("Variable 'name' was changed from current value: '\(oldValue!)' to new value: '\(self.name!)'")
        }
    }
    var text: String? = nil
    {
        didSet(oldValue)
        {
            print("Variable 'text' was changed from current value: '\(oldValue!)' to new value: '\(self.text!)'")
        }
    }
    var tags: [String]? = nil
    
    init(date: Date, name: String? = nil, text: String? = nil, tag: [String]? = nil)
    {
        self.date = date
        if name != nil
        {
            self.name = name
        }
        if text != nil
        {
            self.text = text
        }
        if tag != nil
        {
            self.tags = tag
        }
    }
    
    func description() -> String
    {
        var str: String = "\""
        let dateFormatter = DateFormatter()
        dateFormatter.dateFormat = "dd MMMM yyyy"
        let dateString = dateFormatter.string(from: date)
        str += dateString
        if self.name != nil
        {
            str += "\n"
            str += self.name!
        }
        if self.tags != nil
        {
            str += "\n"
            for i in self.tags!
            {
                str += "[\(i)]"
            }
        }
        if self.text != nil
        {
            str += "\n"
            str += self.text!
        }
        str += "\"\n"
        return str
    }
}

func compare_dates(dt1: Date, dt2: Date){
    if dt1 < dt2 {
        print("\(dt1) is earlier than \(dt2)")
    } else if dt1 > dt2 {
        print("\(dt1) is later than \(dt2)")
    } else if dt1 == dt2 {
        print("dates are equal")
    }
}

var date1 = Date()
var tag1 = ["day", "cold", "weather"]
var diary1 = Diary(date: date1,
                   name: "Breakfast", text: "Cold, bad weather", tag: tag1 )

var calendar = Calendar.current
var dateComponents = DateComponents(calendar: calendar,
                                    year: 2000,
                                    month: 06,
                                    day: 26)

var date2 = calendar.date(from: dateComponents)!

var diary2 = Diary(date: date2,
                   name: "Dinner", text: "Some text bla bla bla")

var date3 = Date(timeIntervalSince1970: -3387277326)
var diary3 = Diary(date: date3)

print(diary1.description())
print(diary2.description())
print(diary3.description())

compare_dates(dt1: date1, dt2: date2)
compare_dates(dt1: date3, dt2: date2)

diary2.name = "Lunch"
diary2.text = "Another text bla bla bla"
diary2.description()
