CREATE TABLE `users` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `email` varchar(255),
  `password` varchar(255),
  `name` varchar(255),
  `phone` varchar(255),
  `brithday` date,
  `avatar` varchar(255),
  `address` varchar(255),
  `role` varchar(255),
  `remember_token` varchar(255)
);

CREATE TABLE `products` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `code` varchar(255),
  `name` varchar(255),
  `categorie_id` int,
  `manufacture_id` int,
  `image` varchar(255),
  `price` int,
  `specification` varchar(255)
);

CREATE TABLE `categories` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `code` varchar(255),
  `name` varchar(255)
);

CREATE TABLE `trademarks` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `code` varchar(255),
  `name` varchar(255)
);

CREATE TABLE `manufactures` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `code` varchar(255),
  `name` varchar(255)
);

CREATE TABLE `storages` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `product_id` int,
  `description` varchar(255),
  `quantity` int
);

CREATE TABLE `carts` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `user_id` int
);

CREATE TABLE `carts_detail` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `cart_id` int,
  `product_id` int,
  `status_id` int,
  `quantity` int
);

CREATE TABLE `orders` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `user_id` int,
  `status_id` int,
  `phone` varchar(255),
  `address` varchar(255)
);

CREATE TABLE `orders_detail` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `orders_id` int,
  `product_id` int
);

CREATE TABLE `vouchers` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `code` varchar(255),
  `name` varchar(255),
  `user_id` int,
  `supplier_id` int,
  `discount` int,
  `quantity` int,
  `voucher_type` int
);

CREATE TABLE `vouchers_item` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `voucher_id` int,
  `product_id` int
);

CREATE TABLE `votes` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `user_id` int,
  `product_id` int,
  `code` varchar(255),
  `name` varchar(255)
);

CREATE TABLE `comments_item` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `comment_id` int,
  `product_id` int
);

CREATE TABLE `comments` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `user_id` int,
  `status_id` int,
  `content` varchar(255)
);

CREATE TABLE `suppliers` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `code` varchar(255),
  `name` varchar(255)
);

CREATE TABLE `points` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `code` varchar(255),
  `quantity` int
);

CREATE TABLE `status` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `name` varchar(255)
);

ALTER TABLE `orders` ADD FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);

ALTER TABLE `orders_detail` ADD FOREIGN KEY (`orders_id`) REFERENCES `orders` (`id`);

ALTER TABLE `orders_detail` ADD FOREIGN KEY (`product_id`) REFERENCES `products` (`id`);

ALTER TABLE `carts` ADD FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);

ALTER TABLE `carts_detail` ADD FOREIGN KEY (`cart_id`) REFERENCES `carts` (`id`);

ALTER TABLE `carts_detail` ADD FOREIGN KEY (`product_id`) REFERENCES `products` (`id`);

ALTER TABLE `votes` ADD FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);

ALTER TABLE `votes` ADD FOREIGN KEY (`product_id`) REFERENCES `products` (`id`);

CREATE TABLE `trademarks_products` (
  `trademarks_id` int,
  `products_id` int,
  PRIMARY KEY (`trademarks_id`, `products_id`)
);

ALTER TABLE `trademarks_products` ADD FOREIGN KEY (`trademarks_id`) REFERENCES `trademarks` (`id`);

ALTER TABLE `trademarks_products` ADD FOREIGN KEY (`products_id`) REFERENCES `products` (`id`);


ALTER TABLE `products` ADD FOREIGN KEY (`manufacture_id`) REFERENCES `manufactures` (`id`);

ALTER TABLE `products` ADD FOREIGN KEY (`categorie_id`) REFERENCES `categories` (`id`);

ALTER TABLE `storages` ADD FOREIGN KEY (`product_id`) REFERENCES `products` (`id`);

ALTER TABLE `vouchers` ADD FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);

ALTER TABLE `vouchers_item` ADD FOREIGN KEY (`voucher_id`) REFERENCES `vouchers` (`id`);

ALTER TABLE `vouchers_item` ADD FOREIGN KEY (`product_id`) REFERENCES `products` (`id`);

ALTER TABLE `comments` ADD FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);

ALTER TABLE `comments_item` ADD FOREIGN KEY (`product_id`) REFERENCES `products` (`id`);

ALTER TABLE `comments_item` ADD FOREIGN KEY (`comment_id`) REFERENCES `comments` (`id`);

ALTER TABLE `vouchers` ADD FOREIGN KEY (`supplier_id`) REFERENCES `suppliers` (`id`);

ALTER TABLE `comments` ADD FOREIGN KEY (`status_id`) REFERENCES `status` (`id`);

ALTER TABLE `carts_detail` ADD FOREIGN KEY (`status_id`) REFERENCES `status` (`id`);

ALTER TABLE `orders` ADD FOREIGN KEY (`status_id`) REFERENCES `status` (`id`);
