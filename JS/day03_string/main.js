function Grade(name, grade, sex) {
  this.name = name,
  this.grade = grade,
  this.sex = sex 
}

const grade1 = new Grade('John', 8, 'M');
const grade2 = new Grade('Sarah', 12, 'F');
const grade3 = new Grade('Bob', 16, 'M');
const grade4 = new Grade('Johnny', 2, 'M');
const grade5 = new Grade('Ethan', 4, 'M');
const grade6 = new Grade('Paula', 18, 'F');
const grade7 = new Grade('Donald', 5, 'M');
const grade8 = new Grade('Jennifer', 13, 'F');
const grade9 = new Grade('Courtney', 15, 'F');
const grade10 = new Grade('Jane', 9, 'F');

let grades = [grade1, grade2,grade3,grade4,grade5,
              grade6,grade7,grade8,grade9,grade10];

//In ra danh sách điểm
function print_grade_list(grade_arr){
  for (grade of grade_arr) {
    console.log(`    ${grade.name} - ${grade.grade} - ${grade.sex}`);
  }
}
console.log("List grades: ");
print_grade_list(grades)


// 1. viết function tính thứ hạng trung bình của cả lớp
const average_grade = grades.reduce((acc, curr) => acc + curr.grade, 0) / grades.length;
console.log('Lab1: ' + average_grade)

// 2.viết function tính thứ hạng trung bình của nam trong lớp
const average_grade_male = grades.filter((student) => student.sex === 'M')
                                 .reduce((acc, curr) => acc + curr.grade,0)
                                  / grades.filter((student) => student.sex === 'M').length;
console.log('Lab2: ' +average_grade_male);
  
// 3. viết function tính thứ hạng trung bình của nữ trong lớp
const average_grade_female = grades.filter((student) => student.sex === 'F')
                                  .reduce((acc, curr) => acc + curr.grade, 0)
                                   / grades.filter((student) => student.sex === 'F').length;

console.log('Lab3: ' +average_grade_female);
// 4. viết function tìm học viên nam có thứ hạng cao nhất trong lớp
const highest_grade_male = grades.filter(student => student.sex === 'M')
                              .reduce((highest, current) => highest.grade > current.grade ? highest : current);
console.log('Lab4: ');
console.log(highest_grade_male); 

  // 5. viết function tìm học viên nữ có thứ hạng cao nhất trong lớp
const highest_grade_female = grades.filter(student => student.sex === 'F')
                                  .reduce((highest, current) => highest.grade > current.grade ? highest : current);
console.log('Lab5: ');
console.log(highest_grade_female);

  // 6.viết function tìm học viên nam có thứ hạng thấp nhất trong lớp
const lowest_grade_male = grades.filter((student) => student.sex === 'M')
                              .reduce((acc, curr) => (curr.grade < acc.grade) ? curr : acc, { grade: Infinity });
console.log('Lab6: ');
console.log(lowest_grade_male);

// 7.viết function tìm học viên nữ có thứ hạng thấp nhất trong lớp
const lowest_grade_female = grades.filter(student => student.sex === 'F')
                                  .reduce((acc, curr) => (curr.grade < acc.grade) ? curr : acc);
console.log('Lab7: ')
console.log(lowest_grade_female);

// 8. viết function  thứ hạng cao nhất của cả lớp
const highest_grade = (grades) =>
    grades.reduce((highest, student) => 
    (student.grade > highest ? student.grade : highest), grades[0].grade);
console.log('Lab8: ' +highest_grade(grades));

// 9. viết function  thứ hạng thấp nhất của cả lớp
const lowest_grade = (grades) =>
    grades.reduce((lowest, student) => 
    (student.grade < lowest ? student.grade : lowest), grades[0].grade);
console.log('Lab9: ' +lowest_grade(grades));

// 10. viết function lấy ra dnah sách tất cả học viên nữ trong lớp
const females = (grades) => grades.filter((student) => student.sex === 'F');
console.log('Lab10: ');

console.log(females(grades));

// 11. viết function  sắp xếp tên học viên theo chiều tăng dần của bảng chữ cái
const sort_by_name = (grades) => {
    return grades.sort((a, b) => a.name.localeCompare(b.name));
};
console.log('Lab11: ');
console.log(sort_by_name(grades));

// 12. viết function sắp xếp thứ hạng học viên theo chiều giảm dần
const sort_descending = (a, b) => b.grade - a.grade;
const sort_by_grade_descending = (grades) => {
  return grades.sort(sort_descending);
}
console.log('Lab12: ');
console.log(sort_by_grade_descending(grades));


// 13.viết function  lấy ra học viên nữ có tên bắt đầu bằng "J"
const filter_female_by_name = (name) => {
    return grades.filter(student => student.sex === 'F' && student.name.startsWith(name));
}
console.log('Lab13: ');
console.log(filter_female_by_name('J')); 

// 14. viết function lấy ra top 5 người có  thứ hạng cao nhất trong lớp
const get_top_5_students = (grades) => {
    return grades.sort((a, b) => b.grade - a.grade).slice(0, 5);
}
console.log('Lab14: ');
console.log(get_top_5_students(grades));
