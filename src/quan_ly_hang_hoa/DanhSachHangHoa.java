package quan_ly_hang_hoa;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class DanhSachHangHoa {

	private static List<HangHoa> dsHangHoa = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void themMoiHangDienMay(String maHang, Date ngayNhap, int donGia, int soLuong, String tt) {
		HangHoa hangHoa = new HangDienMay(maHang, ngayNhap, donGia, soLuong, tt);
		dsHangHoa.add(hangHoa);
	}

	public void themMoiHangThuCong(String maHang, Date ngayNhap, int donGia, int soLuong, String tt) {
		HangHoa hangHoa = new HangThuCong(maHang, ngayNhap, donGia, soLuong, tt);
		dsHangHoa.add(hangHoa);

	}

	public void inDanhSachHangHoa(String path) throws IOException {

		FileWriter file = new FileWriter(path);
		if (!dsHangHoa.isEmpty()) {
			for (HangHoa hangHoa : dsHangHoa) {
				String rs=hangHoa.toString();
				file.write(rs);
			}

		}
	}
}