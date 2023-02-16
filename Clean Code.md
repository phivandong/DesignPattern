# Clean Code
## 1) Lợi ích
Giúp bảo trì mã nguồn.
<br/>
Giúp sửa lỗi tốt hơn.
<br/>
Đọc code dễ hơn.
## 2) Đặc điểm
Mỗi phần code được viết đều để giải quyết một phần của bài toán.
<br/>
Thiết kế và triển khai một cách đơn giản nhất có thể.
<br/>
Có thể kiểm thử dễ dàng, nhất là với kiểm thử tự động.
## 3) Clean Code trong Java
### Project Structure
+ src/main/java: mã nguồn
+ src/main/resources: các file tài nguyên
+ src/test/java: các file test
+ src/test/resources: file tài nguyên cho việc test
### Naming Convention
Quy tắc đặt tên là cần thiết mã nguồn dễ tiếp cận, sửa đổi và bảo trì
+ Class: đặt theo tên đối tượng
+ Biến: mô tả rõ ràng thuộc tính của đối tượng
+ Phương thức: mô tả rõ hành động, nên bắt đầu bằng các động từ chỉ hành động đó
### Source File Structure
Cấu trúc trong 1 file code Java có dạng sau
+ Package statement
+ Import statements
  - All static imports
  - All non-static imports
+ Exactly one top-level class
  - Class variables
  - Instance variables
  - Constructors
  - Methods
