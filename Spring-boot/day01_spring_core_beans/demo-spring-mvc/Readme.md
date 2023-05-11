
						-------------------- SPRING MVC --------------------
1. What:
	- Spring MVC là một framework mô hình MVC (Model-View-Controller) để xây dựng các ứng dụng web Java. Nó cung cấp các thành phần, tiện ích và quy tắc để phát triển các ứng dụng web dễ dàng và hiệu quả.
2. How:
	Spring MVC cho phép phát triển các ứng dụng web Java bằng cách phân chia các thành phần của ứng dụng thành các phần khác nhau, bao gồm:
	- Model: Lớp đại diện cho dữ liệu và luật nghiệp vụ của ứng dụng. (những file như POJO Service, DAO)
	- View: Phần hiển thị dữ liệu cho người dùng. (các file JSP, html,...)
 	- Controller: Lớp xử lý yêu cầu của người dùng và điều phối các hoạt động giữa Model và View. (Chính là Dispatcher Controller, Controller và Handler Mapping)
	Spring MVC sử dụng các annotation để định nghĩa các lớp, phương thức và thuộc tính trong ứng dụng. Nó cũng cung cấp các lớp hỗ trợ như các lớp xử lý định tuyến, bộ điều khiển của Form và các lớp hỗ trợ bảo mật.
3. Why:
	Spring MVC cung cấp nhiều lợi ích để phát triển các ứng dụng web Java, bao gồm:
	- Phân chia rõ ràng: Giúp phân chia các thành phần của ứng dụng thành các phần khác nhau, giúp quản lý mã dễ dàng hơn và giảm thiểu sự phụ thuộc giữa các thành phần.
 	- Dễ dàng kiểm thử: Giúp phát hiện các lỗi và sửa chúng một cách nhanh chóng.
	- Tích hợp các công nghệ khác: Cho phép tích hợp các công nghệ khác như Hibernate, JPA và AngularJS một cách dễ dàng.
	- Bảo mật: Cung cấp tính năng bảo mật, giúp giảm thiểu các lỗ hổng bảo mật trong ứng dụng web.
	- Hiệu suất: Cung cấp tính năng tối ưu hóa hiệu suất và giảm thiểu thời gian phản hồi của ứng dụng.
	- Dễ dàng mở rộng: Là một framework linh hoạt và dễ dàng mở rộng, cho phép phát triển ứng dụng lớn một cách dễ dàng. Cộng đồng: Có một cộng đồng lớn và tích cực, cung cấp các tài liệu hướng dẫn.
	
4. When:
	Spring MVC được sử dụng để phát triển các ứng dụng web Java với các yêu cầu khác nhau, bao gồm:
	- Phát triển các ứng dụng web động: Spring MVC cho phép phát triển các ứng dụng web động với các tính năng như thêm, sửa, xóa và tìm kiếm dữ liệu.
	- Phát triển các ứng dụng web có tính năng phức tạp: Spring MVC cho phép phát triển các ứng dụng web có tính năng phức tạp và đa dạng, bao gồm các tính năng như xử lý đăng nhập, quản lý phiên và bảo mật ứng dụng.
	- Phát triển các ứng dụng web có yêu cầu về hiệu suất cao: Spring MVC cung cấp tính năng tối ưu hóa hiệu suất và giảm thiểu thời gian phản hồi của ứng dụng, cho phép phát triển các ứng dụng web có yêu cầu về hiệu suất cao.
	- Phát triển các ứng dụng web linh hoạt và dễ dàng mở rộng: Spring MVC là một framework linh hoạt và dễ dàng mở rộng, cho phép phát triển các ứng dụng web linh hoạt và dễ dàng mở rộng để đáp ứng các yêu cầu của doanh nghiệp.

5. Flow trong spring mvc: 
	- Bất kỳ request nào tới ứng dụng web đề sẽ gửi tới Dispatcher Servlet (front controller)
	-  từ Dispatcher Servlet sẽ xử dụng Handler Mapping để biết được controller nào sẽ xử lý request đó
	-  Controller nhận request, gọi tới các class service thích hợp để xử lý yêu cầu
	-  Sau khi xử lý xong, Controller sẽ nhận được model từ tầng Service hoặc tầng DAO
	-  Controller gửi model vừa nhận được với Dispatcher Servlet
	-  Dispatcher Servlet sẽ tìm các mẫu view, sử dụng view resolver và truyền model vào nó
	-  View template, model, view page được build và gửi trả lại Dispatcher Servlet
	-  Dispatcher Servlet gửi một page view tới trình duyệt để hiện thị nó cho ng dùng

6. Các cú pháp cơ bản
	- Controller: Đây là thành phần chính của Spring MVC, nơi xử lý các yêu cầu web. Một controller được đánh dấu bằng @Controller annotation và các phương thức xử lý yêu cầu được đánh dấu bằng @RequestMapping annotation.
	
@Controller
public class MyController {
   @RequestMapping("/hello")
   public String hello() {
      return "hello-page";
   }
}
	- RequestMapping: Annotation này được sử dụng để ánh xạ một URL đến một phương thức xử lý tương ứng trong controller. Bạn có thể chỉ định HTTP method, đường dẫn URL và các thông số khác.
	
@RequestMapping(value = "/hello", method = RequestMethod.GET)
public String hello() {
   // Xử lý yêu cầu
   return "hello-page";
}
	- ModelAttribute: Annotation này được sử dụng để đánh dấu một phương thức trong controller, đưa ra dữ liệu mà controller cần truyền đến view. Dữ liệu này sẽ được tự động gắn vào model và có thể sử dụng trong view.

@RequestMapping("/user")
public String getUser(@ModelAttribute("user") User user) {
   // Xử lý yêu cầu
   return "user-page";
}

						-------------------- THYMELEAF --------------------
						
1. What:
	- Thymeleaf là một template engine, tức là một công cụ giúp bạn tạo ra các giao diện người dùng cho ứng dụng web của mình. Thymeleaf cho phép bạn viết các mẫu HTML, CSS và JavaScript để tạo các giao diện động cho ứng dụng web của bạn.

2. How:
	- Thymeleaf được tích hợp vào Spring Framework và có thể sử dụng để tạo các mẫu HTML cho các ứng dụng web Java. Để sử dụng Thymeleaf, bạn cần thêm thư viện Thymeleaf vào dự án của mình và cấu hình cho Spring để sử dụng Thymeleaf.
	- Để tạo một mẫu Thymeleaf, bạn sử dụng các thẻ HTML thông thường nhưng với các thuộc tính Thymeleaf. Thuộc tính Thymeleaf cho phép bạn liên kết dữ liệu từ Spring Controller vào các thành phần trên giao diện, hoặc thực hiện các tính toán và điều kiện để đưa ra các quyết định hiển thị cho người dùng.
3. Why:
 	Thymeleaf có nhiều lợi ích cho việc phát triển ứng dụng web Java, bao gồm:
	- Thymeleaf giúp tạo ra các giao diện động cho ứng dụng web, giúp cho giao diện của ứng dụng của bạn trở nên thân thiện hơn với người dùng.
	- Thymeleaf có thể tích hợp với Spring Framework, giúp cho việc phát triển ứng dụng web Java dễ dàng hơn.
	- Thymeleaf cho phép sử dụng các thuộc tính để liên kết dữ liệu từ Spring Controller vào giao diện, giúp cho việc hiển thị dữ liệu trên giao diện trở nên dễ dàng hơn.
4. When:
	Sử dụng Thymeleaf trong các trường hợp sau:
	- Khi cần tạo ra các giao diện động cho ứng dụng web của mình.
	- Khi sử dụng Spring Framework để phát triển ứng dụng web của mình.
	- Khi cần liên kết dữ liệu từ Spring Controller vào giao diện để hiển thị dữ liệu cho người dùng.
