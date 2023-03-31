-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th3 31, 2023 lúc 10:52 PM
-- Phiên bản máy phục vụ: 10.4.27-MariaDB
-- Phiên bản PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `techmaster`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `attendances`
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

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `classes`
--

CREATE TABLE `classes` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
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
-- Đang đổ dữ liệu cho bảng `classes`
--

INSERT INTO `classes` (`id`, `name`, `user_id`, `course_id`, `address`, `status_id`, `start_at`, `end_at`, `created_at`, `updated_at`, `deleted_at`) VALUES
(1, 'Java16', 10, 4, 'Tố Hữu, Hà Nội', 1, '2022-09-30', '2023-05-18', NULL, NULL, NULL),
(2, 'Java18', 13, 1, '23, Tố Hữu, Hà Nội', 1, '2022-11-30', '2023-05-18', NULL, NULL, NULL),
(3, 'Java17', 13, 2, 'Dịch Vọng Hậu, Hà Nội', 1, '2022-11-03', '2023-06-19', NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `classrooms`
--

CREATE TABLE `classrooms` (
  `user_id` int(11) DEFAULT NULL,
  `class_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `comments`
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

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `courses`
--

CREATE TABLE `courses` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `description` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `courses`
--

INSERT INTO `courses` (`id`, `name`, `description`) VALUES
(1, 'Bootcamp Full Stack Web', '\r\n- Hoàn lại 100% học phí + 10 triệu VND nếu sinh viên không xin được việc\r\n- 5 tháng học toàn thời gian + 1 tháng thực tập có lương tại doanh nghiệp\r\n- Giảng viên hướng dẫn 1:1 kết hợp làm việc nhóm 2-3 sinh viên\r\n- 8 tiếng mỗi ngày, 5 ngày 1 tuần, thời lượng thực hành tăng gấp 3\r\n- Nội dung học giúp học viên làm đa dạng nhiều kỹ năng, dễ kiếm việc làm hơn: thêm Node.js, database, mongodb, docker'),
(2, 'Web Front End + React', 'Học lập trình Web Frontend + React 5 tháng 60 buổi với hình thức đào tạo Offline hoặc 7 tháng 84 buổi với hình thức đào tạo Online. Cam kết việc làm cho học viên sau khi tốt nghiệp với cả hai hình thức đào tạo. Đội ngũ Giảng viên dày dặn kinh nghiệm, Giáo trình đào tạo bài bản, liên tục cập nhật các kiến thức mới nhất, bám sát thực tế khi làm việc.'),
(3, 'Full Stack Java\r\n', 'Khoá học lập trình Full Stack Java bằng Java SpringBoot Fullstack đào tạo học viên xây dựng hoàn thiện trang web từ Frontend đến Backend với Java. Toàn bộ giáo trình xây dựng cho học viên bắt đầu học lập trình từ con số 0 tới khi hoàn thiện được sản phẩm cụ thể. Lộ trình học dài hạn trong 7 tháng với cam kết việc làm cho học viên'),
(4, 'DevOps', '33 buổi học tương đương gần 3 tháng, được học cùng chuyên gia với những kiến thức có thể áp dụng được ngay vào thực tế công việc: Cài đặt sử dụng Linux, Quản lý version với Git, Configuration Management sử dụng Terraform, đóng gói và triển khai ứng dụng với Docker + Kubernetes,...'),
(5, 'Amazon Web Service', 'Nội dung học bao gồm 2 chứng chỉ Solution Architect và Developer, bao quát các dịch vụ AWS đang được ứng dụng rộng rãi nhất\r\n3 tháng học với chuyên gia tương đương 1 năm tự học, tiết kiệm thời gian, tăng tỉ lệ thi đỗ chứng chỉ AWS từ 40% lên 80%\r\nThực hành AWS với 120 video + bài lab thực tế trên các ngôn ngữ Python, Java, Golang: giảng viên thao tác hướng dẫn tỉ mỉ\r\n700 câu hỏi AWS Tiếng Anh có đầy đủ đáp án. 300 câu hỏi được giảng viên giải đáp kĩ lưỡng mỗi buổi học\r\nMỗi học viên sở hữu vĩnh viễn 1 tài khoản giáo trình Microlearning trên hệ thống Techmaster\r\nMôi trường học hỏi năng động, đa chiều, hỏi đáp với với giảng viên và nhiều bạn học từ các công ty đang sử dụng AWS');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `homeworks`
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
-- Đang đổ dữ liệu cho bảng `homeworks`
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
-- Cấu trúc bảng cho bảng `lessons`
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
-- Đang đổ dữ liệu cho bảng `lessons`
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
-- Cấu trúc bảng cho bảng `model_of_comments`
--

CREATE TABLE `model_of_comments` (
  `model_has_comment` int(11) NOT NULL,
  `type` int(11) DEFAULT NULL,
  `comment_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `roles`
--

CREATE TABLE `roles` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `roles`
--

INSERT INTO `roles` (`id`, `name`) VALUES
(1, 'SupAdmin'),
(2, 'Admin'),
(3, 'teacher'),
(4, 'student'),
(5, 'user');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `scores`
--

CREATE TABLE `scores` (
  `id` int(11) NOT NULL,
  `teacher_id` int(11) DEFAULT NULL,
  `homework_id` int(11) DEFAULT NULL,
  `score` int(11) DEFAULT NULL,
  `comment` text DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `deleted_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `status`
--

CREATE TABLE `status` (
  `id` int(11) NOT NULL,
  `value` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Đang đổ dữ liệu cho bảng `status`
--

INSERT INTO `status` (`id`, `value`) VALUES
(1, 0),
(2, 1),
(3, 2);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `subjects`
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
-- Đang đổ dữ liệu cho bảng `subjects`
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
(11, 'AWS', 1, NULL, NULL, NULL),
(12, 'Java Core', 3, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `users`
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
-- Đang đổ dữ liệu cho bảng `users`
--

INSERT INTO `users` (`id`, `email`, `password`, `name`, `birthday`, `gender`, `avatar`, `phone`, `address`, `role_id`, `status_id`, `created_at`, `updated_at`, `deleted_at`) VALUES
(10, 'tai123@gmail.com', '3d2326d4ff44929b3ffcd526c1a7870f', 'Dao Tai', '1992-11-22', 'male', 'dasd856asdf', '0969957697', 'Cầu Giấy, Hà Nội', 4, 1, '2022-10-10 00:05:38', '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(11, 'long@gmail.com', '36ed58c5c14dc2f58eef099585d2a939', 'Long Shen', '1998-11-22', 'male', 'dasd856asdfe1', '67e4324ddfc6feb37881a452fc30a9bf', 'Long Biên - Hà Nội', 4, 1, '2022-11-20 10:14:18', '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(12, 'kiennguyen@gmail.com', '5d2297b2f56654636090aaad75d0578f', 'Kien Nguyen', '1993-11-22', 'male', '23jhv43', '0123456789', 'Đông Anh - Hà Nội', 4, 1, '2022-10-13 10:16:39', '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(13, 'loc@gmail.com', '3a37bf4ff5938162c0d05dc6684956dd', 'Loc Nguyen', '1998-11-22', 'male', 'hvhj34jhv1c', '0987422726', 'Vĩnh Tuy, HN', 4, 1, '2022-10-14 10:17:49', '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(14, 'huong@gmail.com', '59ec5983e698b882c1b306bf2ed88759', 'Thanh Huong', '0000-00-00', 'hjg2323gfhd', '1994-04-20', '098765432', 'Cầu Giấy - Hà Nội', 3, 1, '2022-10-14 10:17:49', '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(15, 'phongtran@gmail.com', 'f8e640d09eb69959d8e6e7f31db59d45', 'Phong Tran', '1998-11-22', 'male', 'hg3g4fty234sa', '0223456789', 'Hà nội', 3, 1, '2022-10-14 10:17:49', '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(16, 'hien@gmail.com', 'eaaf8fdc39a482fdd2e720814cabbf9d', 'Bui Hien', '1996-04-20', 'male', '23hjg342', '091234567', 'Bắc Từ Liêm, Hà Nội', 3, 1, '2022-10-14 10:17:49', '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(17, 'cuong@gmail.com', '1cebe1c4aa2879beb58a2a5951fd480d', 'Cuong techmaster', '1990-11-22', 'male', 'hjgh23j2hg56v', '0123456789', 'Dịch vọng Hậu, Hà nội', 1, 1, '2022-10-14 10:17:49', '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(18, 'nghien@gmail.com', '62f84d7fbcc4bb65a5d40f1237e9b48c', 'Nguyen Hien', '1996-04-20', 'male', 'jkg3h2h324bhv', '0123456789', 'Hà Nội', 2, 1, '2021-10-14 10:17:49', '0000-00-00 00:00:00', '0000-00-00 00:00:00');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `attendances`
--
ALTER TABLE `attendances`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_attendanes_users` (`user_id`),
  ADD KEY `fk_attendanes_classes` (`class_id`),
  ADD KEY `fk_attendanes_status` (`status_id`);

--
-- Chỉ mục cho bảng `classes`
--
ALTER TABLE `classes`
  ADD PRIMARY KEY (`id`),
  ADD KEY `user_id` (`user_id`),
  ADD KEY `course_id` (`course_id`),
  ADD KEY `fk_classes_status` (`status_id`);

--
-- Chỉ mục cho bảng `classrooms`
--
ALTER TABLE `classrooms`
  ADD KEY `user_id` (`user_id`),
  ADD KEY `class_id` (`class_id`);

--
-- Chỉ mục cho bảng `comments`
--
ALTER TABLE `comments`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_comments_users` (`user_id`),
  ADD KEY `fk_comments_status` (`status_id`);

--
-- Chỉ mục cho bảng `courses`
--
ALTER TABLE `courses`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `homeworks`
--
ALTER TABLE `homeworks`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_homeworks_lessons` (`lesson_id`),
  ADD KEY `fk_homeworks_users` (`student_id`);

--
-- Chỉ mục cho bảng `lessons`
--
ALTER TABLE `lessons`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_lessons_users` (`teacher_id`),
  ADD KEY `fk_lessons_subjects` (`subject_id`),
  ADD KEY `fk_lessons_status` (`status_id`);

--
-- Chỉ mục cho bảng `model_of_comments`
--
ALTER TABLE `model_of_comments`
  ADD KEY `fk_model_of_comments_courses` (`model_has_comment`),
  ADD KEY `fk_model_of_comments_comments` (`comment_id`);

--
-- Chỉ mục cho bảng `roles`
--
ALTER TABLE `roles`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `scores`
--
ALTER TABLE `scores`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_scores_users` (`teacher_id`),
  ADD KEY `fk_scores_homeworks` (`homework_id`);

--
-- Chỉ mục cho bảng `status`
--
ALTER TABLE `status`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `subjects`
--
ALTER TABLE `subjects`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_subjects_status` (`status_id`);

--
-- Chỉ mục cho bảng `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_users_roles` (`role_id`),
  ADD KEY `fk_users_status` (`status_id`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `attendances`
--
ALTER TABLE `attendances`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `classes`
--
ALTER TABLE `classes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT cho bảng `comments`
--
ALTER TABLE `comments`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `courses`
--
ALTER TABLE `courses`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT cho bảng `homeworks`
--
ALTER TABLE `homeworks`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT cho bảng `lessons`
--
ALTER TABLE `lessons`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT cho bảng `roles`
--
ALTER TABLE `roles`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT cho bảng `scores`
--
ALTER TABLE `scores`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `status`
--
ALTER TABLE `status`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT cho bảng `subjects`
--
ALTER TABLE `subjects`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT cho bảng `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `attendances`
--
ALTER TABLE `attendances`
  ADD CONSTRAINT `fk_attendanes_classes` FOREIGN KEY (`class_id`) REFERENCES `classes` (`id`),
  ADD CONSTRAINT `fk_attendanes_status` FOREIGN KEY (`status_id`) REFERENCES `status` (`id`),
  ADD CONSTRAINT `fk_attendanes_users` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);

--
-- Các ràng buộc cho bảng `classes`
--
ALTER TABLE `classes`
  ADD CONSTRAINT `classes_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`),
  ADD CONSTRAINT `classes_ibfk_2` FOREIGN KEY (`course_id`) REFERENCES `courses` (`id`),
  ADD CONSTRAINT `fk_classes_status` FOREIGN KEY (`status_id`) REFERENCES `status` (`id`);

--
-- Các ràng buộc cho bảng `classrooms`
--
ALTER TABLE `classrooms`
  ADD CONSTRAINT `classrooms_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`),
  ADD CONSTRAINT `classrooms_ibfk_2` FOREIGN KEY (`class_id`) REFERENCES `classes` (`id`);

--
-- Các ràng buộc cho bảng `comments`
--
ALTER TABLE `comments`
  ADD CONSTRAINT `fk_comments_status` FOREIGN KEY (`status_id`) REFERENCES `status` (`id`),
  ADD CONSTRAINT `fk_comments_users` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);

--
-- Các ràng buộc cho bảng `homeworks`
--
ALTER TABLE `homeworks`
  ADD CONSTRAINT `fk_homeworks_lessons` FOREIGN KEY (`lesson_id`) REFERENCES `lessons` (`id`),
  ADD CONSTRAINT `fk_homeworks_users` FOREIGN KEY (`student_id`) REFERENCES `users` (`id`);

--
-- Các ràng buộc cho bảng `lessons`
--
ALTER TABLE `lessons`
  ADD CONSTRAINT `fk_lessons_status` FOREIGN KEY (`status_id`) REFERENCES `status` (`id`),
  ADD CONSTRAINT `fk_lessons_subjects` FOREIGN KEY (`subject_id`) REFERENCES `subjects` (`id`),
  ADD CONSTRAINT `fk_lessons_users` FOREIGN KEY (`teacher_id`) REFERENCES `users` (`id`);

--
-- Các ràng buộc cho bảng `model_of_comments`
--
ALTER TABLE `model_of_comments`
  ADD CONSTRAINT `fk_model_of_comments_comments` FOREIGN KEY (`comment_id`) REFERENCES `comments` (`id`),
  ADD CONSTRAINT `fk_model_of_comments_courses` FOREIGN KEY (`model_has_comment`) REFERENCES `courses` (`id`);

--
-- Các ràng buộc cho bảng `scores`
--
ALTER TABLE `scores`
  ADD CONSTRAINT `fk_scores_homeworks` FOREIGN KEY (`homework_id`) REFERENCES `homeworks` (`id`),
  ADD CONSTRAINT `fk_scores_users` FOREIGN KEY (`teacher_id`) REFERENCES `users` (`id`);

--
-- Các ràng buộc cho bảng `subjects`
--
ALTER TABLE `subjects`
  ADD CONSTRAINT `fk_subjects_status` FOREIGN KEY (`status_id`) REFERENCES `status` (`id`);

--
-- Các ràng buộc cho bảng `users`
--
ALTER TABLE `users`
  ADD CONSTRAINT `fk_users_roles` FOREIGN KEY (`role_id`) REFERENCES `roles` (`id`),
  ADD CONSTRAINT `fk_users_status` FOREIGN KEY (`status_id`) REFERENCES `status` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
