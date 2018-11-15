struct Date
{
    var day: Int
    var month: String
    var year: Int
    
    let count_days: [String: Int] =
    [
        "January" : 31,
        "Fabruary" : 28,
        "March" : 31,
        "April" : 30,
        "May" : 31,
        "June" : 30,
        "July" : 31,
        "August" : 31,
        "September" : 30,
        "October" : 31,
        "November" : 30,
        "December" : 31
    ]
    init ()
    {
        self.day = 01
        self.month = "January"
        self.year = 2000
    }
    
    init?(day: Int, month: String, year: Int)
    {
        let temp_day = count_days[month]
        if day < 1 || temp_day! < day
        {
            return nil
        }
        self.day = day
        self.month = month
        self.year = year
    }
    
    init(date: Date)
    {
        self.day = date.day
        self.month = date.month
        self.year = date.year
    }
    
    func description() -> String
    {
        return "Day: \(self.day)  Month: \(self.month)  Year: \(self.year)"
    }
    
}

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
    var tags: [String.SubSequence]? = nil
    
    init(date: Date, name: String? = nil, text: String? = nil, tag: String? = nil)
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
            self.tags = tag!.split(separator: ",")
        }
        
    }
    
    func description() -> String
    {
        var str: String = "\""
        str += "\(self.date.day) \(self.date.month) \(self.date.year)"
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

var date1 = Date(day: 30, month: "June", year: 2018)
if date1 == nil
{
    date1 = Date()
}
var diary1 = Diary(date: date1!,
                   name: "Breakfast", text: "Cold, bad weather", tag: "day,cold,weather")

var date2 = Date(day: 01, month: "July", year: 2020)
if date2 == nil
{
    date2 = Date()
}
var diary2 = Diary(date: date2!,
                   name: "Dinner", text: "Some text bla bla bla")

var date3 = Date(day: 32, month: "June", year: 2007)
if date3 == nil
{
   date3 = Date()
}
var diary3 = Diary(date: date3!)
print(diary1.description())
print(diary2.description())
print(diary3.description())

diary2.name = "Lunch"
diary2.text = "Another text bla bla bla"
diary2.description()


var date4 = Date(day: 15, month: "June", year: 2000)
var date5 = Date(date: date4!)
print(date4!.description())
print(date5.description())

