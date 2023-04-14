function is_prime(n) {
    if(n < 2) {
        return false;
    }
    for(let i = 2; i <= Math.sqrt(n); i++) {
        if(n % i === 0) {
            return false;
        }
    }
    return true;
}
// Lab1: Viết hàm tính tổng các số lẻ và chia hết cho 3 trong mảng
// arr[1, 2, 3, 4, 5, 6]
function sum_odd_number_divisible_by_3(arr) {
    let sum = 0;
    for(let i = 0; i < arr.length; i++) {
        if(arr[i] % 2 !== 0 && arr[i] % 3 === 0) {
            sum +=arr[i];
        }
    }
    return sum;
}
const arr = [1,2,3,4,5,6];
const rs = sum_odd_number_divisible_by_3(arr);
console.log(rs);

// Lab2: Viết hàm tính tổng các số nguyên tố trong mảng
// arr[2, 3, 4, 5, 6, 10, 12, 17]
function sum_of_primes(arr2) {
    let sum2 = 0;
    for(let i = 0; i < arr2.length; i++) {
        if(is_prime(arr2[i])) {
            sum2 += arr2[i];
        }
    }
    return sum2;
}

const arr2 = [2,3,4,5,6,10,12,17];
const rs2 = sum_of_primes(arr2);
console.log(rs2);

//Lab3: Viết function cho phép truyền vào 1 mảng các số, kết quả trả về là 1 mảng mới với các số là
// số dư tương ứng khi chia mảng cũ cho 2
// Ví dụ : [4,2,5,6,2,7] => [0,0,1,0,0,1]
function remainder_array(arr3) {
    const rs3 = [];
    for(let i = 0; i < arr3.length; i++) {
        rs3.push(arr3[i] % 2);
    }
    return rs3;
}
const arr3 = [4,2,5,6,2,7];
const rs3 = remainder_array(arr3);
console.log(rs3);

//Lab4: Viết function để kiểm tra 1 giá trị có nằm trong mảng hay không?
function check_value(arr3, value) {
    return arr3.includes(value);
}
const value1 = 3;
const value2 = 6;
console.log(check_value(arr3, value1));
console.log(check_value(arr3, value2));

//Lab 5: Viết hàm trả về một mảng chỉ gồm các số chia hết cho 3 và 5 nhỏ hơn 100
function get_number_divisible_by_3_and_5() {
    const rs5 = [];
    for (let i = 1; i < 100; i++) {
        if(i % 15 === 0) {
            rs5.push(i);
        }
    }
    return rs5;
}
const arr5 = get_number_divisible_by_3_and_5();
console.log(arr5);

//Lab 6: Viết hàm trả về một mảng chỉ gồm các số nguyên tố từ một mảng đã cho ban đầu
// [1, 2, 4, 5, 8, 9, 11] => [2, 5, 11]
function find_primes(arr6) {
    const primes = [];
    for (let i = 0; i < arr6.length; i++) {
        if (is_prime(arr6[i])) {
            primes.push(arr6[i]);
        }
    }
    return primes;
}


const arr6 = [1, 2, 4, 5, 8, 9, 11];
const rs6 = find_primes(arr6);
console.log(rs6);

//Lab 7:  Viết hàm trả xóa các phần tử có giá trị bằng k trong một mảng
function remove_elements(arr6, k) {
    return arr6.filter((item) => item !== k);
}
const k = 5;
const rs7 = remove_elements(arr6, k);
console.log(rs7);

// Lab 9: Viết function truyền vào 1 chuỗi, hãy sao chép đó chuỗi lên 10 lần (Sử dụng array để làm)
// Ví dụ: repeatString(‘a’) => Kết quả trả về là ‘aaaaaaaaaa’
function repeat_string(str) {
    const arr9 = new Array(10).fill(str);
    return arr9.join('');
}
console.log(repeat_string('a'))

// Lab 10: Viết function truyền vào 1 chuỗi, hãy sao chép đó chuỗi lên 10 lần, ngăn cách nhau bởi dấu gạch
// ngang (Sử dụng array để làm)
// Ví dụ: repeatString(‘a’) => Kết quả trả về là ‘a-a-a-a-a-a-a-a-a-a
function repeat_string10(str10) {
    const arr10 = [];
    for (let i = 0; i < 10; i++) {
        arr10.push(str10);
    }
    return arr10.join('-');
}
console.log(repeat_string10('a'));

                                    //LAB 2:

// Bài 1: Viết function để kiểm tra 1 giá trị có nằm trong mảng hay không?
// checkElementExist([1,2,3,4,5], 5) => true
// checkElementExist([1,2,3,4,5], 6) => false

function checkElementExist(arr, value) {
    return arr.includes(value);
}
console.log(checkElementExist([1,2,3,4,5], 5));
console.log(checkElementExist([1,2,3,4,5], 6));

// Bài 2: Viết function truyền vào 1 mảng các số, và 1 giá trị bất kỳ. Trả về mảng mới với các giá trị lớn
// hơn giá trị truyền vào
// getElementGreater([1,2,3,4,5], 3) => [4,5]
// getElementGreater([1,2,3,4,5], 5) => []
function getElementGreater(arr, value) {
    const greaterElements = arr.filter((element) => element > value);
    return greaterElements;
}
console.log(getElementGreater([1,2,3,4,5], 3));
console.log(getElementGreater([1,2,3,4,5], 5));


// Bài 3: Viết function để tạo mã màu HEX ngẫu nhiên.
// randomHexCode() => #728a98
// randomHexCode() => #a72938
function randomHexCode() {
    const hexValues = '0123456789ABCDEF';
    let hexCode = '#';
    for (let i = 0; i < 6; i++) 
        hexCode += hexValues[Math.floor(Math.random() * 16)];
    return hexCode;
}
console.log(randomHexCode());
console.log(randomHexCode());

