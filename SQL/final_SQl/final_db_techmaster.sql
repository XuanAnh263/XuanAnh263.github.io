-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 02, 2023 at 09:42 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.0.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `final_db_techmaster`
--

-- --------------------------------------------------------

--
-- Table structure for table `attendances`
--

CREATE TABLE `attendances` (
  `id` int(11) NOT NULL,
  `user_id` int(11) DEFAULT NULL,
  `class_id` int(11) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `status_id` int(11) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `deleted_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `attendances`
--

INSERT INTO `attendances` (`id`, `user_id`, `class_id`, `date`, `status_id`, `created_at`, `updated_at`, `deleted_at`) VALUES
(1, 11, 3, '2023-03-27', 1, '2023-03-27 11:03:55', NULL, NULL),
(2, 12, 3, '2023-03-27', 1, '2023-03-27 11:03:55', NULL, NULL),
(3, 11, 3, '2023-03-30', 1, '2023-03-30 11:03:55', NULL, NULL),
(4, 12, 3, '2023-03-30', 1, '2023-03-30 11:03:55', NULL, NULL),
(5, 10, 2, '2023-03-25', 1, '2023-03-25 11:03:55', NULL, NULL),
(6, 13, 2, '2023-03-25', 1, '2023-03-25 11:03:55', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `classes`
--

CREATE TABLE `classes` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `course_id` int(11) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `status_id` int(11) DEFAULT NULL,
  `start_at` date DEFAULT NULL,
  `end_at` date DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `deleted_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `classes`
--

INSERT INTO `classes` (`id`, `name`, `course_id`, `address`, `status_id`, `start_at`, `end_at`, `created_at`, `updated_at`, `deleted_at`) VALUES
(1, 'Java16', 4, 'Tố Hữu, Hà Nội', 1, '2022-09-30', '2023-05-18', NULL, NULL, NULL),
(2, 'Java18', 1, '23, Tố Hữu, Hà Nội', 1, '2022-11-30', '2023-05-18', NULL, NULL, NULL),
(3, 'Java17', 2, 'Dịch Vọng Hậu, Hà Nội', 1, '2022-11-03', '2023-06-19', NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `classrooms`
--

CREATE TABLE `classrooms` (
  `id` int(11) NOT NULL,
  `user_id` int(11) DEFAULT NULL,
  `class_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `classrooms`
--

INSERT INTO `classrooms` (`id`, `user_id`, `class_id`) VALUES
(1, 10, 2),
(2, 11, 3),
(3, 12, 3),
(4, 13, 2);

-- --------------------------------------------------------

--
-- Table structure for table `comments`
--

CREATE TABLE `comments` (
  `id` int(11) NOT NULL,
  `user_id` int(11) DEFAULT NULL,
  `content` text DEFAULT NULL,
  `status_id` int(11) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `deleted_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `comments`
--

INSERT INTO `comments` (`id`, `user_id`, `content`, `status_id`, `created_at`, `updated_at`, `deleted_at`) VALUES
(1, 13, 'Mấy buổi đầu khá choáng váng vì trong lớp nhiều bạn làm bài tập nhanh quá. Giờ mình đã bắt kịp, thậm chí còn được phần thưởng vì giải bài tập nhanh nhất lớp', 1, '2023-03-07 07:22:59', NULL, NULL),
(2, 10, 'Chương trình đào tạo ở Techmaster được thiết kế cô đọng, không lan man và có thể giúp một người học lập trình từ zero thành hero nhờ vào bài giảng và kiến thức có chọn lọc, đúng trọng tâm và \"hay ho\"', 1, '2023-01-16 07:22:59', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `courses`
--

CREATE TABLE `courses` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `description` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `courses`
--

INSERT INTO `courses` (`id`, `name`, `description`) VALUES
(1, 'Bootcamp Full Stack Web', '\r\n- Hoàn lại 100% học phí + 10 triệu VND nếu sinh viên không xin được việc\r\n- 5 tháng học toàn thời gian + 1 tháng thực tập có lương tại doanh nghiệp\r\n- Giảng viên hướng dẫn 1:1 kết hợp làm việc nhóm 2-3 sinh viên\r\n- 8 tiếng mỗi ngày, 5 ngày 1 tuần, thời lượng thực hành tăng gấp 3\r\n- Nội dung học giúp học viên làm đa dạng nhiều kỹ năng, dễ kiếm việc làm hơn: thêm Node.js, database, mongodb, docker'),
(2, 'Web Front End + React', 'Học lập trình Web Frontend + React 5 tháng 60 buổi với hình thức đào tạo Offline hoặc 7 tháng 84 buổi với hình thức đào tạo Online. Cam kết việc làm cho học viên sau khi tốt nghiệp với cả hai hình thức đào tạo. Đội ngũ Giảng viên dày dặn kinh nghiệm, Giáo trình đào tạo bài bản, liên tục cập nhật các kiến thức mới nhất, bám sát thực tế khi làm việc.'),
(3, 'Full Stack Java\r\n', 'Khoá học lập trình Full Stack Java bằng Java SpringBoot Fullstack đào tạo học viên xây dựng hoàn thiện trang web từ Frontend đến Backend với Java. Toàn bộ giáo trình xây dựng cho học viên bắt đầu học lập trình từ con số 0 tới khi hoàn thiện được sản phẩm cụ thể. Lộ trình học dài hạn trong 7 tháng với cam kết việc làm cho học viên'),
(4, 'DevOps', '33 buổi học tương đương gần 3 tháng, được học cùng chuyên gia với những kiến thức có thể áp dụng được ngay vào thực tế công việc: Cài đặt sử dụng Linux, Quản lý version với Git, Configuration Management sử dụng Terraform, đóng gói và triển khai ứng dụng với Docker + Kubernetes,...'),
(5, 'Amazon Web Service', 'Nội dung học bao gồm 2 chứng chỉ Solution Architect và Developer, bao quát các dịch vụ AWS đang được ứng dụng rộng rãi nhất\r\n3 tháng học với chuyên gia tương đương 1 năm tự học, tiết kiệm thời gian, tăng tỉ lệ thi đỗ chứng chỉ AWS từ 40% lên 80%\r\nThực hành AWS với 120 video + bài lab thực tế trên các ngôn ngữ Python, Java, Golang: giảng viên thao tác hướng dẫn tỉ mỉ\r\n700 câu hỏi AWS Tiếng Anh có đầy đủ đáp án. 300 câu hỏi được giảng viên giải đáp kĩ lưỡng mỗi buổi học\r\nMỗi học viên sở hữu vĩnh viễn 1 tài khoản giáo trình Microlearning trên hệ thống Techmaster\r\nMôi trường học hỏi năng động, đa chiều, hỏi đáp với với giảng viên và nhiều bạn học từ các công ty đang sử dụng AWS');

-- --------------------------------------------------------

--
-- Table structure for table `homeworks`
--

CREATE TABLE `homeworks` (
  `id` int(11) NOT NULL,
  `lesson_id` int(11) DEFAULT NULL,
  `student_id` int(11) DEFAULT NULL,
  `content` text DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `deleted_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `homeworks`
--

INSERT INTO `homeworks` (`id`, `lesson_id`, `student_id`, `content`, `created_at`, `updated_at`, `deleted_at`) VALUES
(1, 2, 10, 'Link bài tập', '2023-03-31 10:51:51', NULL, NULL),
(2, 3, 13, 'Link bài tập', '2023-03-31 10:51:51', NULL, NULL),
(3, 1, 12, 'Link bài tập', '2023-03-31 10:51:51', NULL, NULL),
(4, 7, 11, 'Link bài tập', '2023-03-31 10:51:51', NULL, NULL),
(5, 4, 12, 'Link bài tập', '2023-03-31 10:51:51', NULL, NULL),
(6, 5, 10, 'Link bài tập', '2023-03-31 10:51:51', NULL, NULL),
(7, 3, 11, 'Link bài tập', '2023-03-31 10:51:51', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `lessons`
--

CREATE TABLE `lessons` (
  `id` int(11) NOT NULL,
  `teacher_id` int(11) DEFAULT NULL,
  `subject_id` int(11) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `status_id` int(11) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `deleted_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `lessons`
--

INSERT INTO `lessons` (`id`, `teacher_id`, `subject_id`, `title`, `content`, `status_id`, `created_at`, `updated_at`, `deleted_at`) VALUES
(1, 14, 1, 'HTML cơ bản', 'HTML cơ bản', 1, '2021-04-21 10:42:31', '2021-05-21 10:42:31', '0000-00-00 00:00:00'),
(2, 15, 1, 'CSS cơ bản + hướng dẫn sử dụng Git', 'Link bài', 1, '2021-04-21 10:42:31', '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(3, 15, 1, 'Dàn layout với flex box', 'hướng dẫn', 1, '2021-04-21 10:42:31', '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(4, 16, 12, 'Nhập xuất trong Java', 'Thực hành', 1, '2021-04-21 10:42:31', '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(5, 16, 7, 'Mảng và Chuỗi | Array & String (DB)', 'link bài', 1, '2021-04-21 10:42:31', '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(6, 14, 8, 'Giới thiệu về Database', 'Tìm hiểu', 1, '2021-04-21 10:42:31', '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(7, 15, 8, 'JOIN TABLE (DB)', 'Join', 1, '2021-04-21 10:42:31', '0000-00-00 00:00:00', '0000-00-00 00:00:00');

-- --------------------------------------------------------

--
-- Table structure for table `model_of_comments`
--

CREATE TABLE `model_of_comments` (
  `model_has_comment` int(11) NOT NULL,
  `type` int(11) DEFAULT NULL,
  `comment_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `model_of_comments`
--

INSERT INTO `model_of_comments` (`model_has_comment`, `type`, `comment_id`) VALUES
(3, 1, 1),
(2, 1, 2);

-- --------------------------------------------------------

--
-- Table structure for table `roles`
--

CREATE TABLE `roles` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `roles`
--

INSERT INTO `roles` (`id`, `name`) VALUES
(1, 'SupAdmin'),
(2, 'Admin'),
(3, 'teacher'),
(4, 'student');

-- --------------------------------------------------------

--
-- Table structure for table `scores`
--

CREATE TABLE `scores` (
  `id` int(11) NOT NULL,
  `teacher_id` int(11) DEFAULT NULL,
  `homework_id` int(11) DEFAULT NULL,
  `score` char(11) DEFAULT NULL,
  `comment` text DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `deleted_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `scores`
--

INSERT INTO `scores` (`id`, `teacher_id`, `homework_id`, `score`, `comment`, `created_at`, `updated_at`, `deleted_at`) VALUES
(1, 14, 1, '9.60', 'Well done!', '2023-04-01 10:55:12', NULL, NULL),
(2, 14, 2, '8.80', 'Well done!', '2023-04-01 10:55:12', NULL, NULL),
(3, 14, 3, '8.60', 'Good Job!', '2023-04-01 10:55:12', NULL, NULL),
(4, 14, 4, '8.50', 'Good!', '2023-04-01 10:55:12', NULL, NULL),
(5, 14, 5, '8.90', 'Well done!', '2023-04-01 10:55:12', NULL, NULL),
(6, 14, 6, '8.00', 'Good Job!', '2023-04-01 10:55:12', NULL, NULL),
(7, 14, 7, '7.00', 'Good!', '2023-04-01 10:55:12', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `status`
--

CREATE TABLE `status` (
  `id` int(11) NOT NULL,
  `value` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `status`
--

INSERT INTO `status` (`id`, `value`) VALUES
(1, 0),
(2, 1),
(3, 2),
(4, 3),
(5, 4);

-- --------------------------------------------------------

--
-- Table structure for table `subjects`
--

CREATE TABLE `subjects` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `status_id` int(11) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `deleted_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `subjects`
--

INSERT INTO `subjects` (`id`, `name`, `status_id`, `created_at`, `updated_at`, `deleted_at`) VALUES
(1, 'Web căn bản (HTML, CSS)', 1, NULL, NULL, NULL),
(2, 'JavaScript', 1, NULL, NULL, NULL),
(3, 'Thiết kế UI/UX', 1, NULL, NULL, NULL),
(4, 'ReactJS', 1, NULL, NULL, NULL),
(5, 'NodeJS', 1, NULL, NULL, NULL),
(6, 'Project Web tĩnh', 1, NULL, NULL, NULL),
(7, 'Data structure and Algorithm', 1, NULL, NULL, NULL),
(8, 'Database', 1, NULL, NULL, NULL),
(9, 'Spring boot', 1, NULL, NULL, NULL),
(10, 'DevOps', 3, NULL, NULL, NULL),
(11, 'AWS', 4, NULL, NULL, NULL),
(12, 'Java Core', 3, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `avatar` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  `status_id` int(11) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `deleted_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `email`, `password`, `name`, `birthday`, `gender`, `avatar`, `phone`, `address`, `role_id`, `status_id`, `created_at`, `updated_at`, `deleted_at`) VALUES
(10, 'tai123@gmail.com', '3d2326d4ff44929b3ffcd526c1a7870f', 'Dao Tai', '1992-11-22', 'male', 'dasd856asdf', '0969957697', 'Cầu Giấy, Hà Nội', 4, 1, '2022-10-10 00:05:38', '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(11, 'long@gmail.com', '36ed58c5c14dc2f58eef099585d2a939', 'Long Shen', '1998-11-22', 'male', 'dasd856asdfe1', '0987834737', 'Long Biên - Hà Nội', 4, 1, '2022-11-20 10:14:18', '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(12, 'kiennguyen@gmail.com', '5d2297b2f56654636090aaad75d0578f', 'Kien Nguyen', '1993-11-22', 'male', '23jhv43', '0123456789', 'Đông Anh - Hà Nội', 4, 1, '2022-10-13 10:16:39', '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(13, 'loc@gmail.com', '3a37bf4ff5938162c0d05dc6684956dd', 'Loc Nguyen', '1998-11-22', 'male', 'hvhj34jhv1c', '0987422726', 'Vĩnh Tuy, HN', 4, 1, '2022-10-14 10:17:49', '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(14, 'huong@gmail.com', '59ec5983e698b882c1b306bf2ed88759', 'Thanh Huong', '1994-02-01', 'female', 'djsfh23hhjsd', '098765432', 'Cầu Giấy - Hà Nội', 3, 1, '2022-10-14 10:17:49', '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(15, 'phongtran@gmail.com', 'f8e640d09eb69959d8e6e7f31db59d45', 'Phong Tran', '1998-11-22', 'male', 'hg3g4fty234sa', '0223456789', 'Hà nội', 3, 1, '2022-10-14 10:17:49', '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(16, 'hien@gmail.com', 'eaaf8fdc39a482fdd2e720814cabbf9d', 'Bui Hien', '1996-04-20', 'male', '23hjg342', '091234567', 'Bắc Từ Liêm, Hà Nội', 3, 1, '2022-10-14 10:17:49', '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(17, 'cuong@gmail.com', '1cebe1c4aa2879beb58a2a5951fd480d', 'Cuong techmaster', '1990-11-22', 'male', 'hjgh23j2hg56v', '0123456789', 'Dịch vọng Hậu, Hà nội', 1, 1, '2022-10-14 10:17:49', '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(18, 'nghien@gmail.com', '62f84d7fbcc4bb65a5d40f1237e9b48c', 'Nguyen Hien', '1996-04-20', 'male', 'jkg3h2h324bhv', '0123456789', 'Hà Nội', 2, 1, '2021-10-14 10:17:49', '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(19, 'quanghien1008@gmail.com', '62f84d7fbcc4bb65a5d40f1237e9b48c', 'Nguyen Quang Hien', '1998-09-22', 'male', 'jkg3h2h324bhv', '012345622', 'Hà Nội', 4, 3, '2023-01-03 10:17:49', '0000-00-00 00:00:00', '0000-00-00 00:00:00');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `attendances`
--
ALTER TABLE `attendances`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_attendanes_users` (`user_id`),
  ADD KEY `fk_attendanes_classes` (`class_id`),
  ADD KEY `fk_attendanes_status` (`status_id`);

--
-- Indexes for table `classes`
--
ALTER TABLE `classes`
  ADD PRIMARY KEY (`id`),
  ADD KEY `course_id` (`course_id`),
  ADD KEY `fk_classes_status` (`status_id`);

--
-- Indexes for table `classrooms`
--
ALTER TABLE `classrooms`
  ADD PRIMARY KEY (`id`),
  ADD KEY `user_id` (`user_id`),
  ADD KEY `class_id` (`class_id`);

--
-- Indexes for table `comments`
--
ALTER TABLE `comments`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_comments_users` (`user_id`),
  ADD KEY `fk_comments_status` (`status_id`);

--
-- Indexes for table `courses`
--
ALTER TABLE `courses`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `homeworks`
--
ALTER TABLE `homeworks`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_homeworks_lessons` (`lesson_id`),
  ADD KEY `fk_homeworks_users` (`student_id`);

--
-- Indexes for table `lessons`
--
ALTER TABLE `lessons`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_lessons_users` (`teacher_id`),
  ADD KEY `fk_lessons_subjects` (`subject_id`),
  ADD KEY `fk_lessons_status` (`status_id`);

--
-- Indexes for table `model_of_comments`
--
ALTER TABLE `model_of_comments`
  ADD KEY `fk_model_of_comments_courses` (`model_has_comment`),
  ADD KEY `fk_model_of_comments_comments` (`comment_id`);

--
-- Indexes for table `roles`
--
ALTER TABLE `roles`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `scores`
--
ALTER TABLE `scores`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_scores_users` (`teacher_id`),
  ADD KEY `fk_scores_homeworks` (`homework_id`);

--
-- Indexes for table `status`
--
ALTER TABLE `status`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `subjects`
--
ALTER TABLE `subjects`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_subjects_status` (`status_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_users_roles` (`role_id`),
  ADD KEY `fk_users_status` (`status_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `attendances`
--
ALTER TABLE `attendances`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `classes`
--
ALTER TABLE `classes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `classrooms`
--
ALTER TABLE `classrooms`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `comments`
--
ALTER TABLE `comments`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `courses`
--
ALTER TABLE `courses`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `homeworks`
--
ALTER TABLE `homeworks`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `lessons`
--
ALTER TABLE `lessons`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `roles`
--
ALTER TABLE `roles`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `scores`
--
ALTER TABLE `scores`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `status`
--
ALTER TABLE `status`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `subjects`
--
ALTER TABLE `subjects`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `attendances`
--
ALTER TABLE `attendances`
  ADD CONSTRAINT `fk_attendanes_classes` FOREIGN KEY (`class_id`) REFERENCES `classes` (`id`),
  ADD CONSTRAINT `fk_attendanes_status` FOREIGN KEY (`status_id`) REFERENCES `status` (`id`),
  ADD CONSTRAINT `fk_attendanes_users` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);

--
-- Constraints for table `classes`
--
ALTER TABLE `classes`
  ADD CONSTRAINT `classes_ibfk_2` FOREIGN KEY (`course_id`) REFERENCES `courses` (`id`),
  ADD CONSTRAINT `fk_classes_status` FOREIGN KEY (`status_id`) REFERENCES `status` (`id`);

--
-- Constraints for table `classrooms`
--
ALTER TABLE `classrooms`
  ADD CONSTRAINT `classrooms_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`),
  ADD CONSTRAINT `classrooms_ibfk_2` FOREIGN KEY (`class_id`) REFERENCES `classes` (`id`);

--
-- Constraints for table `comments`
--
ALTER TABLE `comments`
  ADD CONSTRAINT `fk_comments_status` FOREIGN KEY (`status_id`) REFERENCES `status` (`id`),
  ADD CONSTRAINT `fk_comments_users` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);

--
-- Constraints for table `homeworks`
--
ALTER TABLE `homeworks`
  ADD CONSTRAINT `fk_homeworks_lessons` FOREIGN KEY (`lesson_id`) REFERENCES `lessons` (`id`),
  ADD CONSTRAINT `fk_homeworks_users` FOREIGN KEY (`student_id`) REFERENCES `users` (`id`);

--
-- Constraints for table `lessons`
--
ALTER TABLE `lessons`
  ADD CONSTRAINT `fk_lessons_status` FOREIGN KEY (`status_id`) REFERENCES `status` (`id`),
  ADD CONSTRAINT `fk_lessons_subjects` FOREIGN KEY (`subject_id`) REFERENCES `subjects` (`id`),
  ADD CONSTRAINT `fk_lessons_users` FOREIGN KEY (`teacher_id`) REFERENCES `users` (`id`);

--
-- Constraints for table `model_of_comments`
--
ALTER TABLE `model_of_comments`
  ADD CONSTRAINT `fk_model_of_comments_comments` FOREIGN KEY (`comment_id`) REFERENCES `comments` (`id`),
  ADD CONSTRAINT `fk_model_of_comments_courses` FOREIGN KEY (`model_has_comment`) REFERENCES `courses` (`id`);

--
-- Constraints for table `scores`
--
ALTER TABLE `scores`
  ADD CONSTRAINT `fk_scores_homeworks` FOREIGN KEY (`homework_id`) REFERENCES `homeworks` (`id`),
  ADD CONSTRAINT `fk_scores_users` FOREIGN KEY (`teacher_id`) REFERENCES `users` (`id`);

--
-- Constraints for table `subjects`
--
ALTER TABLE `subjects`
  ADD CONSTRAINT `fk_subjects_status` FOREIGN KEY (`status_id`) REFERENCES `status` (`id`);

--
-- Constraints for table `users`
--
ALTER TABLE `users`
  ADD CONSTRAINT `fk_users_roles` FOREIGN KEY (`role_id`) REFERENCES `roles` (`id`),
  ADD CONSTRAINT `fk_users_status` FOREIGN KEY (`status_id`) REFERENCES `status` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
