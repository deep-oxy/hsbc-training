let empData=[
    { empId: 100, name: "Piyush", city: "Hyderabad", salary: 54000 },
    { empId: 101, name: "Deep", city: "Pune", salary: 55000 },
    { empId: 102, name: "Abhishek", city: "Vellore", salary: 56600 },
    { empId: 103, name: "John", city: "Chennai", salary: 52200 },
    { empId: 104, name: "Scott", city: "Haryana", salary: 32000 },
    { empId: 105, name: "David", city: "Delhi", salary: 12200 },
    { empId: 106, name: "Jesus", city: "Patna", salary: 62000 },
    { empId: 107, name: "Raja", city: "Dhanbad", salary: 56000 }
  ];

  // let emp=empData.filter((value)=>{return value.name.indexOf("Deep")!=-1?value:null});
  let emp=empData.filter((value)=>{return value.empId==106?value:null});
  console.log(emp);