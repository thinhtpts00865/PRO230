Create database CongTyCoKhiTVT
use CongTyCoKhiTVT

CREATE TABLE TaiKhoan (
    maNV NVARCHAR(10) PRIMARY KEY,
    username NVARCHAR(50) NOT NULL,
    password NVARCHAR(50) NOT NULL,
    vaiTro BIT NOT NULL
);

CREATE TABLE NhanVien (
    maNV NVARCHAR(10) PRIMARY KEY,
    tenNV NVARCHAR(50) NOT NULL,
    gioiTinh BIT,
    ngaySinh DATE,
    soDienThoai INT,
    email NVARCHAR(255),
    diaChi NVARCHAR(255),
    luong FLOAT,
    vaiTro BIT,
    hinhAnh NVARCHAR(255)
);

CREATE TABLE KhachHang (
    maKH NVARCHAR(10) PRIMARY KEY,
    tenKH NVARCHAR(50) NOT NULL,
    gioiTinh BIT,
    ngaySinh DATE,
    soDienThoai INT,
    email NVARCHAR(255),
    diaChi NVARCHAR(255)
);

CREATE TABLE KhoHang (
    maKho NVARCHAR(10) PRIMARY KEY,
    maNV NVARCHAR(10),
    tenKho NVARCHAR(255),
    tenSP NVARCHAR(255),
    tenNV NVARCHAR(255),
    ngayNhap DATE,
    soLuongKho INT,
    FOREIGN KEY (maNV) REFERENCES NhanVien(maNV)
);

CREATE TABLE SanPham (
    maSP NVARCHAR(10) PRIMARY KEY,
    maKho NVARCHAR(10),
    maNV NVARCHAR(10),
    tenSP NVARCHAR(255) NOT NULL,
    moTa NVARCHAR(255),
    gia FLOAT,
    soLuongKho INT,
    tenNV NVARCHAR(255),
    loaiSP NVARCHAR(255),
    hinhAnh NVARCHAR(255),
    FOREIGN KEY (maKho) REFERENCES KhoHang(maKho),
    FOREIGN KEY (maNV) REFERENCES NhanVien(maNV)
);

CREATE TABLE DonHang (
    maDH NVARCHAR(10) PRIMARY KEY,
    maKH NVARCHAR(10),
    ngayDat DATE,
    trangThai NVARCHAR(50),
    tongTien FLOAT,
    FOREIGN KEY (maKH) REFERENCES KhachHang(maKH)
);

CREATE TABLE ChiTietDonHang (
    maCDH NVARCHAR(10) PRIMARY KEY,
    maDH NVARCHAR(10),
    maSP NVARCHAR(10),
    tenSP NVARCHAR(255),
    soLuong INT,
    gia FLOAT,
    FOREIGN KEY (maDH) REFERENCES DonHang(maDH),
    FOREIGN KEY (maSP) REFERENCES SanPham(maSP)
);
-- Thêm 10 tài khoản
INSERT INTO TaiKhoan (maNV, username, password, vaiTro) VALUES
('NV001', 'user1', 'pass1', 1),
('NV002', 'user2', 'pass2', 0),
('NV003', 'user3', 'pass3', 0),
('NV004', 'user4', 'pass4', 0),
('NV005', 'user5', 'pass5', 0),
('NV006', 'user6', 'pass6', 0),
('NV007', 'user7', 'pass7', 0),
('NV008', 'user8', 'pass8', 0),
('NV009', 'user9', 'pass9', 0),
('NV010', 'user10', 'pass10', 0);

-- Thêm 10 nhân viên
INSERT INTO NhanVien (maNV, tenNV, gioiTinh, ngaySinh, soDienThoai, email, diaChi, luong, vaiTro, hinhAnh) VALUES
('NV001', 'Nguyen Van A', 1, '1990-05-20', 123456789, 'a@email.com', 'Ha Noi', 15000000, 1, 'a.jpg'),
('NV002', 'Tran Van B', 1, '1992-07-15', 123456788, 'b@email.com', 'Hai Phong', 12000000, 0, 'b.jpg'),
('NV003', 'Le Thi C', 0, '1995-09-10', 123456787, 'c@email.com', 'Da Nang', 13000000, 0, 'c.jpg'),
('NV004', 'Pham Van D', 1, '1988-11-25', 123456786, 'd@email.com', 'HCM', 14000000, 0, 'd.jpg'),
('NV005', 'Hoang Thi E', 0, '1993-03-30', 123456785, 'e@email.com', 'Can Tho', 11000000, 0, 'e.jpg'),
('NV006', 'Vu Van F', 1, '1985-12-01', 123456784, 'f@email.com', 'Vinh', 17000000, 0, 'f.jpg'),
('NV007', 'Dang Van G', 1, '1991-04-22', 123456783, 'g@email.com', 'Hue', 12500000, 0, 'g.jpg'),
('NV008', 'Do Thi H', 0, '1994-06-18', 123456782, 'h@email.com', 'Quang Ninh', 13500000, 0, 'h.jpg'),
('NV009', 'Ngo Van I', 1, '1989-08-08', 123456781, 'i@email.com', 'Bac Ninh', 14500000, 0, 'i.jpg'),
('NV010', 'Bui Thi J', 0, '1996-10-05', 123456780, 'j@email.com', 'Nha Trang', 12500000, 0, 'j.jpg');

-- Thêm 3 kho hàng
INSERT INTO KhoHang (maKho, maNV, tenKho, tenSP, tenNV, ngayNhap, soLuongKho) VALUES
('K001', 'NV001', 'Kho Ha Noi', NULL, 'Nguyen Van A', '2024-01-01', 500),
('K002', 'NV002', 'Kho HCM', NULL, 'Tran Van B', '2024-01-05', 600),
('K003', 'NV003', 'Kho Da Nang', NULL, 'Le Thi C', '2024-01-10', 700);

INSERT INTO KhachHang (maKH, tenKH, gioiTinh, ngaySinh, soDienThoai, email, diaChi) VALUES
('KH001', 'Nguyen Van 1', 1, '1985-02-15', 987654321, 'kh1@email.com', 'Ha Noi'),
('KH002', 'Tran Thi 2', 0, '1990-06-25', 987654322, 'kh2@email.com', 'Hai Phong'),
('KH003', 'Le Van 3', 1, '1982-11-12', 987654323, 'kh3@email.com', 'Da Nang'),
('KH004', 'Pham Thi 4', 0, '1995-03-22', 987654324, 'kh4@email.com', 'HCM'),
('KH005', 'Hoang Van 5', 1, '1988-07-19', 987654325, 'kh5@email.com', 'Can Tho'),
('KH006', 'Vu Thi 6', 0, '1993-09-05', 987654326, 'kh6@email.com', 'Vinh'),
('KH007', 'Dang Van 7', 1, '1987-04-10', 987654327, 'kh7@email.com', 'Hue'),
('KH008', 'Do Thi 8', 0, '1991-06-30', 987654328, 'kh8@email.com', 'Quang Ninh'),
('KH009', 'Ngo Van 9', 1, '1989-01-08', 987654329, 'kh9@email.com', 'Bac Ninh'),
('KH010', 'Bui Thi 10', 0, '1996-10-20', 987654330, 'kh10@email.com', 'Nha Trang'),
('KH011', 'Nguyen Van 11', 1, '1984-12-15', 987654331, 'kh11@email.com', 'Ha Noi'),
('KH012', 'Tran Thi 12', 0, '1992-02-25', 987654332, 'kh12@email.com', 'Hai Phong'),
('KH013', 'Le Van 13', 1, '1986-09-12', 987654333, 'kh13@email.com', 'Da Nang'),
('KH014', 'Pham Thi 14', 0, '1994-05-22', 987654334, 'kh14@email.com', 'HCM'),
('KH015', 'Hoang Van 15', 1, '1983-08-19', 987654335, 'kh15@email.com', 'Can Tho'),
('KH016', 'Vu Thi 16', 0, '1997-11-05', 987654336, 'kh16@email.com', 'Vinh'),
('KH017', 'Dang Van 17', 1, '1990-01-10', 987654337, 'kh17@email.com', 'Hue'),
('KH018', 'Do Thi 18', 0, '1998-07-30', 987654338, 'kh18@email.com', 'Quang Ninh'),
('KH019', 'Ngo Van 19', 1, '1981-03-08', 987654339, 'kh19@email.com', 'Bac Ninh'),
('KH020', 'Le Van 20', 1, '1999-08-15', 987654340, 'kh20@email.com', 'Da Lat');

-- Thêm 20 sản phẩm cơ khí
INSERT INTO SanPham (maSP, maKho, maNV, tenSP, moTa, gia, soLuongKho, tenNV, loaiSP, hinhAnh) VALUES
('SP001', 'K001', 'NV001', N'Bu lông ốc vít', N'Bu lông thép không gỉ', 5000, 100, N'Nguyen Van A', N'Linh kiện cơ khí', 'BuLong.jpg'),
('SP002', 'K002', 'NV002', N'Bánh răng công nghiệp', N'Bánh răng hợp kim cao cấp', 20000, 50, N'Tran Van B', N'Linh kiện cơ khí', 'banhrang.jpg'),
('SP003', 'K003', 'NV003', N'Vòng bi bạc đạn', N'Vòng bi siêu bền', 15000, 80, N'Le Thi C', N'Linh kiện cơ khí', 'vongbi.jpg'),
('SP004', 'K001', 'NV004', N'Trục vít me', N'Trục vít cho hệ thống cơ khí', 35000, 40, N'Nguyen Van D', N'Linh kiện cơ khí', 'trucvitme.jpg'),
('SP005', 'K002', 'NV005', N'Xích công nghiệp', N'Xích chịu lực cao', 50000, 30, N'Tran Van E', N'Linh kiện cơ khí', 'xichcongnghiep.jpg'),
('SP006', 'K003', 'NV006', N'Đai ốc ren', N'Đai ốc ren chống mài mòn', 7000, 120, N'Le Thi F', N'Linh kiện cơ khí', 'daiocren.jpg'),
('SP007', 'K001', 'NV007', N'Khớp nối nhanh', N'Khớp nối thép hợp kim', 25000, 60, N'Nguyen Van G', N'Linh kiện cơ khí', 'khopnoinhanh.jpg'),
('SP008', 'K002', 'NV008', N'Piston thủy lực', N'Piston dùng cho hệ thống cơ khí', 100000, 20, N'Tran Van H', N'Linh kiện cơ khí', 'pistonthuyluc.jpg'),
('SP009', 'K003', 'NV009', N'Bạc đạn cầu', N'Bạc đạn siêu bền', 12000, 90, N'Le Thi I', N'Linh kiện cơ khí', 'bacdancau.jpg'),
('SP010', 'K001', 'NV010', N'Trục truyền động', N'Trục truyền động công nghiệp', 75000, 25, N'Nguyen Van J', N'Linh kiện cơ khí', 'tructruyendong.jpg'),
('SP011', 'K002', 'NV001', N'Dây curoa', N'Dây curoa chịu nhiệt cao', 40000, 35, N'Nguyen Van A', N'Linh kiện cơ khí', 'daycuroa.jpg'),
('SP012', 'K003', 'NV002', N'Bánh đà', N'Bánh đà dùng cho động cơ', 85000, 15, N'Tran Van B', N'Linh kiện cơ khí', 'banhda.png'),
('SP013', 'K001', 'NV003', N'Thanh trượt', N'Thanh trượt chính xác cao', 55000, 50, N'Le Thi C', N'Linh kiện cơ khí', 'thanhtruot.jpg'),
('SP014', 'K002', 'NV004', N'Lò xo công nghiệp', N'Lò xo đàn hồi cao', 30000, 45, N'Nguyen Van D', N'Linh kiện cơ khí', 'loxocongnghiep.jpg'),
('SP015', 'K003', 'NV005', N'Bánh xe đỡ', N'Bánh xe chịu tải trọng lớn', 90000, 20, N'Tran Van E', N'Linh kiện cơ khí', 'banhxedo.jpg'),
('SP016', 'K001', 'NV006', N'Bộ giảm chấn', N'Bộ giảm chấn siêu bền', 110000, 10, N'Le Thi F', N'Linh kiện cơ khí', 'bogiamchan.jpg'),
('SP017', 'K002', 'NV007', N'Cụm bánh răng', N'Cụm bánh răng chính xác cao', 65000, 40, N'Nguyen Van G', N'Linh kiện cơ khí', 'cumbanhrang.png'),
('SP018', 'K003', 'NV008', N'Thanh giằng', N'Thanh giằng chịu lực tốt', 48000, 55, N'Tran Van H', N'Linh kiện cơ khí', 'thanhgiang.jpg'),
('SP019', 'K001', 'NV009', N'Ổ bi tự lựa', N'Ổ bi chống mài mòn', 13000, 70, N'Le Thi I', N'Linh kiện cơ khí', 'obitulua.jpg'),
('SP020', 'K003', 'NV010', N'Hộp số tự động', N'Hộp số dùng cho động cơ cơ khí', 1500000, 5, N'Nguyen Van J', N'Linh kiện cơ khí', 'hopsotudong.jpg');

delete from DonHang

-- Thêm 20 đơn hàng với ngày tháng trải đều trong 12 tháng
INSERT INTO DonHang (maDH, maKH, ngayDat, trangThai, tongTien) VALUES
('DH001', 'KH001', '2024-01-05', N'Chưa thanh toán', 1000000),
('DH002', 'KH002', '2024-02-10', N'Chưa giao hàng', 500000),
('DH003', 'KH003', '2024-03-15', N'Đã giao', 1200000),  -- Đã sửa
('DH004', 'KH004', '2024-04-20', N'Hủy đơn hàng', 800000),
('DH005', 'KH005', '2024-05-08', N'Chưa thanh toán', 1500000),
('DH006', 'KH006', '2024-06-12', N'Hủy đơn hàng', 300000),
('DH007', 'KH007', '2024-07-18', N'Chưa giao hàng', 400000),
('DH008', 'KH008', '2024-08-25', N'Đã giao', 600000),  -- Đã sửa
('DH009', 'KH009', '2024-09-07', N'Chưa giao hàng', 900000),
('DH010', 'KH010', '2024-10-14', N'Chưa thanh toán', 700000),
('DH011', 'KH011', '2024-11-21', N'Chưa giao hàng', 950000),
('DH012', 'KH012', '2024-12-30', N'Đã giao', 550000),  -- Đã sửa
('DH013', 'KH013', '2024-01-11', N'Hủy đơn hàng', 650000),
('DH014', 'KH014', '2024-02-19', N'Chưa thanh toán', 850000),
('DH015', 'KH015', '2024-03-27', N'Chưa giao hàng', 750000),
('DH016', 'KH016', '2024-04-05', N'Đã giao', 950000),  -- Đã sửa
('DH017', 'KH017', '2024-05-13', N'Hủy đơn hàng', 400000),
('DH018', 'KH018', '2024-06-22', N'Chưa giao hàng', 300000),
('DH019', 'KH019', '2024-07-29', N'Chưa thanh toán', 500000),
('DH020', 'KH020', '2024-08-09', N'Hủy đơn hàng', 200000);




-- Thêm 20 chi tiết đơn hàng
INSERT INTO ChiTietDonHang (maCDH, maDH, maSP, tenSP, soLuong, gia) VALUES
('CDH001', 'DH001', 'SP001', N'Bu lông ốc vít', 10, 5000),
('CDH002', 'DH002', 'SP002', N'Bánh răng công nghiệp', 5, 20000),
('CDH003', 'DH003', 'SP003', N'Vòng bi bạc đạn', 8, 15000),
('CDH004', 'DH004', 'SP004', N'Trục vít me', 6, 35000),
('CDH005', 'DH005', 'SP005', N'Xích công nghiệp', 3, 50000),
('CDH006', 'DH006', 'SP006', N'Đai ốc ren', 15, 7000),
('CDH007', 'DH007', 'SP007', N'Khớp nối nhanh', 7, 25000),
('CDH008', 'DH008', 'SP008', N'Piston thủy lực', 2, 100000),
('CDH009', 'DH009', 'SP009', N'Bạc đạn cầu', 9, 12000),
('CDH010', 'DH010', 'SP010', N'Trục truyền động', 4, 75000),
('CDH011', 'DH011', 'SP011', N'Dây curoa', 5, 40000),
('CDH012', 'DH012', 'SP012', N'Bánh đà', 3, 85000),
('CDH013', 'DH013', 'SP013', N'Thanh trượt', 6, 55000),
('CDH014', 'DH014', 'SP014', N'Lò xo công nghiệp', 8, 30000),
('CDH015', 'DH015', 'SP015', N'Bánh xe đỡ', 2, 90000),
('CDH016', 'DH016', 'SP016', N'Bộ giảm chấn', 1, 110000),
('CDH017', 'DH017', 'SP017', N'Cụm bánh răng', 7, 65000),
('CDH018', 'DH018', 'SP018', N'Thanh giằng', 4, 48000),
('CDH019', 'DH019', 'SP019', N'Ổ bi tự lựa', 10, 13000),
('CDH020', 'DH020', 'SP020', N'Hộp số tự động', 1, 1500000);
GO
CREATE PROCEDURE Top10SanPhamBanChay
AS
BEGIN
    SELECT TOP 10 
		sp.hinhAnh,
        sp.tenSP, 
        SUM(ctdh.soLuong) AS tongSoLuongBan
    FROM ChiTietDonHang ctdh
    JOIN SanPham sp ON ctdh.maSP = sp.maSP
    GROUP BY sp.maSP, sp.tenSP, sp.hinhAnh
    ORDER BY tongSoLuongBan DESC;
END;

GO
CREATE PROCEDURE DonHangTrangThai
AS
BEGIN
    SET NOCOUNT ON;
    
    SELECT 
        SUM(CASE WHEN trangThai = N'Chưa thanh toán' THEN 1 ELSE 0 END) AS ChuaThanhToan,
        SUM(CASE WHEN trangThai = N'Chưa giao hàng' THEN 1 ELSE 0 END) AS ChuaGiao,
        SUM(CASE WHEN trangThai = N'Đã Giao' THEN 1 ELSE 0 END) AS DaGiao,
        SUM(CASE WHEN trangThai = N'Hủy đơn hàng' THEN 1 ELSE 0 END) AS HuyDon
    FROM DonHang;
END;
EXEC DonHangTrangThai;





