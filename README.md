# 🛒 QUẢN LÝ SIÊU THỊ MINI (MINI SUPERMARKET MANAGEMENT)

> **Đồ án môn học: Lập trình Hướng đối tượng (OOP)** - **Học viện Công nghệ Bưu chính Viễn thông cơ sở TP Hồ Chí Minh**


## 📖 Giới thiệu (Introduction)

Dự án **Quản lý siêu thị mini** là phần mềm Desktop được xây dựng nhằm tự động hóa quy trình bán hàng, quản lý kho và nhân sự cho các cửa hàng quy mô nhỏ. Dự án áp dụng triệt để các nguyên lý của **Lập trình hướng đối tượng (OOP)** và mô hình kiến trúc **3 lớp (3-Layer Architecture)** để đảm bảo tính bảo mật, dễ bảo trì và mở rộng.

## 🚀 Chức năng chính (Features)

### Quản trị viên (Admin)
- **Quản lý sản phẩm:** Thêm, xóa, sửa, tìm kiếm thông tin hàng hóa, cập nhật giá và số lượng tồn.
- **Quản lý nhân viên:** Quản lý danh sách nhân viên, thêm nhân viên.
- **Quản lý hóa đơn:** Tìm kiếm, xem thông tin chi tiết hóa đơn.
- **Quản lý nhập xuất:** Thêm, xóa, sửa, tìm kiếm thông tin các phiếu nhập và phiếu hủy sản phẩm.
- **Quản lý khuyến mãi:** Thêm, xóa, sửa, tìm kiếm thông tin các voucher và giảm giá sản phẩm.
- **Thống kê báo cáo:** Xem doanh thu, thống kê hàng bán chạy.


## 🛠 Công nghệ sử dụng (Tech Stack)

| Thành phần | Công nghệ / Công cụ |
| :--- | :--- |
| **Ngôn ngữ** | Java (JDK 17+) |
| **Giao diện (GUI)** | Java Swing |
| **Cơ sở dữ liệu** | MySQL |
| **Kết nối DB** | JDBC (Java Database Connectivity) |
| **IDE** | NetBeans / IntelliJ IDEA / Visual Studio Code |
| **Kiến trúc** | Mô hình 3 lớp (GUI - BUS - DAL) |

## 🏗 Kiến trúc hệ thống (Architecture)

Dự án được tổ chức theo mô hình 3 lớp tách biệt:

1.  **GUI (Graphical User Interface):** Giao diện người dùng. Chịu trách nhiệm hiển thị và nhận sự kiện từ người dùng.
2.  **BUS (Business Logic Layer):** Xử lý nghiệp vụ chính. Đây là lớp trung gian, đóng vai trò là bộ não của phần mềm. 
3.  **DAL (Data Access Layer):** Truy cập cơ sở dữ liệu (thực thi các câu lệnh SQL). Lớp này chịu trách nhiệm duy nhất là làm việc với dữ liệu.

Ngoài ra sử dụng **DTO (Data Transfer Object)** để truyền tải dữ liệu giữa các lớp.

## ⚙️ Cài đặt và Hướng dẫn chạy (Installation)

1.  **Clone dự án:**
    ```bash
    git clone https://github.com/duynhat1504/QuanLySieuThi_OOP.git
    ```
2.  **Cấu hình Cơ sở dữ liệu:**
    - Mở MySQL Workbench hoặc phpMyAdmin.
    - Tạo database mới tên `quanlysieuthi`.
    - Import file `sieuthimini.sql` (nằm trong thư mục `Database` của dự án).
    - Cập nhật thông tin kết nối (user/password) trong file `dbconfig.properties`.
3.  **Mở dự án:**
    - Khởi động NetBeans/IntelliJ IDEA/Visual Studio Code.
    - Open Project -> Chọn thư mục vừa clone.
4.  **Chạy ứng dụng:**
    - Tìm file `App.java` và chọn **Run**.


## 👥 Nhóm thực hiện (Authors)

Dự án được thực hiện bởi nhóm sinh viên lớp Lập trình hướng đối tượng - PTIT:

| STT | Họ và tên | Mã sinh viên | Vai trò |
| :--- | :--- | :--- | :--- |
| 1 | **Hồ Duy Nhất** | N23DCCN111 | Trưởng nhóm |
| 2 | **Khổng Phú Cường** | N23DCCN076 | Thành viên |
| 3 | **Lê Mạnh Hùng** | N23DCCN091 | Thành viên |
| 4 | **Trần Tấn Phát** | N23DCCN113 | Thành viên |


