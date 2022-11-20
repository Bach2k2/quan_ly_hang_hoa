package quan_ly_hang_hoa;

import java.sql.Date;

public class HangThuCong extends HangHoa{
	private String nhaSanXuat;

	public HangThuCong() {
		super();
	}
	public HangThuCong(String nhaSanXuat) {
		super();
		this.nhaSanXuat = nhaSanXuat;
	}
	public HangThuCong(String maHang, Date ngayNhap, int donGia, int soLuong,String nhaSanXuat) {
		super(maHang, ngayNhap, donGia, soLuong);
		// TODO Auto-generated constructor stub
		this.nhaSanXuat = nhaSanXuat;
	}
	public String getNhaSanXuat() {
		return nhaSanXuat;
	}
	public void setNhaSanXuat(String nhaSanXuat) {
		this.nhaSanXuat = nhaSanXuat;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  this.getMaHang() + " " + this.getNgayNhap()+ " " + this.getDonGia() + " "
		+ this.getSoLuong() + " " + nhaSanXuat ;
	}
	
}
