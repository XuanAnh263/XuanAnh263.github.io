// Lab1: Viết function truyền vào 2 số a, b. In ra màn hình số có giá trị lớn hơn
function find_number_max(a,b) {
    console.log(Math.max(23,10));
 }
find_number_max();
 
 //Lab2: Viết function nhập vào 1 số. Kiểm tra số đó là số chẵn hay số lẻ.
function parity_check(a) {
   if (a % 2 === 0) {
     console.log(a + ' là số chẵn');
   } else {
     console.log(a + ' là số lẻ');
   }
}
parity_check(12);
 
 //Lab3: Viết function nhập vào 1 số. Kiểm tra số đó có đồng thời chia hết cho 3 và 5 không.
function check_number(a) {
   if (a % 15 === 0) {
     return true;
   } else {
     return false;
   }
}
check_number(45);

 //Lab4: Viết function nhập vào 3 số a, b, c. Kiểm tra xem c có bằng a + b không?
function check_sum_number(a, b, c) {
    if (a + b === c) {
      console.log(`${a} + ${b} = ${c}`);
    } else {
      console.log(`${a} + ${b} != ${c}`);
    }
}
check_sum_number(1, 2, 3);

 // Lab5: Viết function nhập vào biến mark có giá trị từ 0 -> 100. Kiểm tra giá trị của biến mark và
 // in ra nội dung sau
 // ● ”A” nếu mark >= 85
 // ● ”B” nếu 70 <= mark < 85
 // ● ”C” nếu 40 <= mark < 70
 // ● Các trường hợp còn lại in ra “D”
 
function check_mark(mark){
    if(mark >= 85) {
        console.log('A');
    } else if (mark >= 70 && mark < 85) {
        console.log('B');
    } else if (mark >= 40 && mark < 70) {
        console.log('C');
    } else {
        console.log('D');
    }
}
check_mark(65);

//Lab1: Tạo biến day có giá trị từ 0 -> 6, là các ngày trong tuần Trong đó: (0 - chủ nhật, 1 - thứ 2, …, 6 -
//Thứ 7) Sử dụng switch-case để in ra ngày tương ứng với giá trị của biến day
function print_day_of_week(day) {
    switch (day) {
      case 0:
        console.log("Chủ nhật");
        break;
      case 1:
        console.log("Thứ 2");
        break;
      case 2:
        console.log("Thứ 3");
        break;
      case 3:
        console.log("Thứ 4");
        break;
      case 4:
        console.log("Thứ 5");
        break;
      case 5:
        console.log("Thứ 6");
        break;
      case 6:
        console.log("Thứ 7");
        break;
      default:
        console.log("Giá trị không hợp lệ");
    }
}
  
var day = 3; 
print_day_of_week(day);

// Lab2: Tạo biến month có giá trị từ 1 -> 12, là các tháng trong năm
// Sử dụng switch-case để in ra mùa tương ứng với giá trị của biến month
// ● 1, 2, 3 : Mùa xuân
// ● 4, 5, 6 : Mùa hạ
// ● 7, 8, 9 : Mùa thu
// ● 10, 11, 12 : Mùa đông
function print_season(month) {
    switch(month) {
        case 1:
        case 2:
        case 3:
          console.log("Mùa xuân");
          break;
        case 4:
        case 5:
        case 6:
          console.log("Mùa hạ");
          break;
        case 7:
        case 8:
        case 9:
          console.log("Mùa thu");
          break;
        case 10:
        case 11:
        case 12:
          console.log("Mùa đông");
          break;
        default:
          console.log("Không hợp lệ");
          break;
    }
}
var month = 6;
print_season(month);


// Lab1: Viết function truyền vào 1 chuỗi bất kỳ, hãy viết hàm
// có tác dụng sao chép đó chuỗi lên 10 lần, ngăn cách nhau
// bởi dấu gạch ngang


function coppy_string_use_for(str) {
    let rs = '';
    for(let i = 0; i < 10; i++) {
        rs += str + '-';  
    }
    rs = rs.slice(0, -1);
    return rs;
}
let input_string = 'hello';
let copied_string =  coppy_string_use_for(input_string);

console.log(copied_string);

function copy_string_use_while(str) {
    let rs = '';
    let count = 0;
    while(count < 10) {
        rs += str + '-';
        count++;
    }
    rs = rs.slice(0, -1);
    return rs;
}
let input_string_use_while= 'say hi';
let copied_string_use_while = copy_string_use_while(input_string_use_while);
console.log(copied_string_use_while);




// Homework_day01:

// Lab1: Viết function truyền vào 1 chuỗi bất kỳ và 1 số nguyên dương n > 1, hãy viết hàm có tác dụng sao
// chép đó chuỗi lên n lần, ngăn cách nhau bởi dấu gạch ngang.

function copy_string_with_dash(str, n) {
    if (n <= 1) {
      console.log("Vui lòng nhập số nguyên dương n > 1");
      return;
    }
    let rs = "";
    for (let i = 0; i < n; i++) {
      rs += str + "-";
    }
    rs = rs.slice(0, rs.length - 1);
    return rs;
}
let str = "done";
let n = 5;
let rs = copy_string_with_dash(str, n);
console.log(rs);

// Lab2: Tính tổng các số chia hết cho 5 từ 0 -> 100
function sum_numbers_divisible_by_5() {
    let sum = 0;
    for (let i = 0; i <= 100; i++) {
      if (i % 5 === 0) {
        sum += i;
      }
    }
    return sum;
}
console.log("Tổng các số chia hết cho 5 từ 0 đến 100 là: " + sum_numbers_divisible_by_5());
  

// Lab3: Viết hàm truyền vào 2 số nguyên, tính tổng tất cả các số nguyên nằm giữa chúng.
function sum_between_integers(a, b) {
    if (a >= b) {
      console.log("Vui lòng đảm bảo a < b");
      return 0;
    }
    let sum = 0;
    for (let i = a + 1; i < b; i++) {
      sum += i;
    }
    return sum; 
}
let a = 13;
let b = 88;
let sum = sum_between_integers(a, b);
console.log(`Tổng các số nguyên nằm giữa ${a} và ${b} là: ${sum}`);

// Lab4: Cho 1 số, kiểm tra xem số đó có phải là số nguyên tố hay không, kết quả trả về true hoặc false.
function is_prime(number) {
    if (number <= 1) {
      return false;
    }
    for (let i = 2; i <= Math.sqrt(number); i++) {
      if (number % i === 0) {
        return false;
      }
    }
    return true;
}
console.log(is_prime(19));

// Lab5: Cho 1 số nguyên dương bất kỳ. Tính tổng tất cả các số nguyên tố mà nhỏ hơn hoặc bằng tham số
// truyền vào.
function sum_prime_numbers(n) {
    let sum1 = 0;
    for (let i = 1; i <= n; i++) {    
      let isPrime = true;
      for (let j = 2; j < i; j++) {
        if (i % j === 0) {
          isPrime = false;
          break;
        }
      }
    if (isPrime) {
        sum1 += i;
    }
    }
    return sum1;
}
let m = 110;
let sum1 = sum_prime_numbers(m);
console.log(`Tổng các số nguyên tố từ 1 đến ${m} là: ${sum1}`);

// Lab6: Cho 1 số nguyên dương, viết hàm tính tổng tất cả các ước số của số đó.
function sum_of_divisors(number) {
    let sum = 0;
    for (let i = 1; i <= number; i++) {
      if (number % i === 0) {
        sum += i;
      }
    }
    return sum;
}
console.log(sum_of_divisors(12));