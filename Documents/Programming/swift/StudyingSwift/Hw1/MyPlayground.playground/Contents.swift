import Foundation
<<<<<<< HEAD
=======

// Why do you need to create custom "Date" struct
// If you already have "Date" struct in Foundation provided by Apple ?

//struct Date
//{
//    var day: Int
//    var month: String
//    var year: Int
//
//    let count_days: [String: Int] =
//    [
//        "January" : 31,
//        "Fabruary" : 28,
//        "March" : 31,
//        "April" : 30,
//        "May" : 31,
//        "June" : 30,
//        "July" : 31,
//        "August" : 31,
//        "September" : 30,
//        "October" : 31,
//        "November" : 30,
//        "December" : 31
//    ]
//    init ()
//    {
//        self.day = 01
//        self.month = "January"
//        self.year = 2000
//    }
//
//    init?(day: Int, month: String, year: Int)
//    {
//        let temp_day = count_days[month]
//        if day < 1 || temp_day! < day
//        {
//            return nil
//        }
//        self.day = day
//        self.month = month
//        self.year = year
//    }
//
//    init(date: Date)
//    {
//        self.day = date.day
//        self.month = date.month
//        self.year = date.year
//    }
//
//    func description() -> String
//    {
//        return "Day: \(self.day)  Month: \(self.month)  Year: \(self.year)"
//    }
//
//}
>>>>>>> 07d01cfcdfda80b24d030814f6891478d073e1ee

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
<<<<<<< HEAD
    var tags: [String]? = nil
=======
    var tags: [String.SubSequence]? = nil // wrong, use [String] instead
>>>>>>> 07d01cfcdfda80b24d030814f6891478d073e1ee
    
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
<<<<<<< HEAD
            self.tags = tag
=======
            self.tags = tag!.split(separator: ",") // wrong, pass Array of Strings instead
>>>>>>> 07d01cfcdfda80b24d030814f6891478d073e1ee
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
<<<<<<< HEAD
=======


var date4 = Date(day: 15, month: "June", year: 2000)
var date5 = Date(date: date4!)
print(date4!.description())
print(date5.description())

// Conclusion:
//      1. Re-write code using standard "Date" strunc from "Foundation"
//      2. Check howto compare two Date instances
//      3. tags should be Array of Strings, e.g. Array<String> or by literal [String]
//      4. Use Code Style for Swift, since you're writting code not in Swift manner

>>>>>>> 07d01cfcdfda80b24d030814f6891478d073e1ee
