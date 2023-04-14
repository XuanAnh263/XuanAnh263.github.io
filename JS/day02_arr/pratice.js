//Pratice

// Lab1:
//Viết các hàm số thực hiện các yêu cầu sau:
//1.1 Hàm tính tổng các số trong mảng function sum(arr)
function sum(arr) {
    let rs = 0;
    for (let i = 0; i < arr.length; i++)
        rs += arr[i];
    return rs;
}

//1.2 Hàm tính tích các số trong mảng function multiple(arr)
function multiple(arr) {
    let rs2 = l;
    for (let i = 0; i <arr.length; i++)
        rs2 *= arr[i];
    return rs2;
}

//1.3 Hàm tính giá trị trung bình của các số trong mảng function average(arr)
function average(arr) {
    let sum = 0;
    for (let i = 0; i <arr.length; i++)
        sum += arr[i];
    return sum / arr.length;
}

//1.4 Hàm trả ra mảng gồm các phần tử lớn hơn 1 số cho trước function bigger_key(arr, key)
function bigger_key(arr, key) {
    let rs4 = [];
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] > key)
            rs.push(arr[i]);
    }
    return rs4;
}

// Lab2:
// Viết hàm chèn một phần tử vào 1 vị trí cho trước:
// funtion insert_element(arr, pos) chèn vào vị trí pos
function insert_element(arr2, pos, value) {
    arr2.splice(pos, 0, value);
    return arr2;
}
let arr2 = [1, 2, 3, 4];
insert_element(arr2, 2, 10);
console.log(arr2);

// Lab3:
// Viết hàm lọc ra toàn bộ các số chính phương trong mảng
// function filter_square_number(arr)
// vd: [1,3,4,9,12,16,21] => [1,4,9,16]
function filter_square_number(arr3) {
    return arr3.filter(num => Math.sqrt(num) % 1 === 0);
}
let arr3 = [1, 3, 4, 9, 12, 16, 21];
let result = filter_square_number(arr3);
console.log(result);


// Lab4:
// Viết hàm tìm số nguyên tố lớn nhất trong mảng cho sẵn
// function find_big_prime_num(arr)
// vd: [1,2,3,4,8, 17,5,11,13] => 17
function is_prime(num) {
    if (num < 2) return false;
    for (let i = 2; i <= Math.sqrt(num); i++) {
      if (num % i === 0)
        return false;
    }
    return true;
}
function find_big_prime_num(arr4) {
    let max_prime = null;
    for (let i = 0; i < arr4.length; i++) {
        if (is_prime(arr4[i]) && (max_prime === null || arr4[i] > max_prime))
            max_prime = arr4[i];
    }
    return max_prime;
}
let arr4 = [1, 2, 3, 4, 8, 17, 5, 11, 13];

console.log(find_big_prime_num(arr4));


// Lab5:
// Viết hàm thay thế các số âm trong mảng thành số 0
// function replace(arr)
// vd: [1,-3,-5,-1,1,5] => [1,0,0,0,1,5]
function replace(arr5) {
    return arr5.map(function(num) {
        return num < 0 ? 0 : num;
    });
}
let arr5 = [1, -3, -5, -1, 1, 5];
let rs5 = replace(arr);
console.log(rs5);

// Lab6:
// Viết hàm xóa các số nguyên tố trong mảng 
// function delete_prime_num(arr)
// vd: [1,2,3,4,56,7,8,9] => [1,4,56,8,9,]
function delete_prime_num(arr6) {
    return arr6.filter(function(item){
        return !is_prime(item)
    });
}
let arr6 = [1, 2, 3, 4, 56, 7, 8, 9];
let rs6 = delete_prime_num(arr6);
console.log(rs6)