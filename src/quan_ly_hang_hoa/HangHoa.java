package quan_ly_hang_hoa;

import java.sql.Date;

public abstract class HangHoa {
	private String maHang;
	private Date ngayNhap;
	private int donGia;
	private int soLuong;
	
	
	public HangHoa() {
		super();
	}

	public HangHoa(String maHang, Date ngayNhap, int donGia, int soLuong) {
		super();
		this.maHang = maHang;
		this.ngayNhap = ngayNhap;
		this.donGia = donGia;
		this.soLuong = soLuong;
	}



	public String getMaHang() {
		return maHang;
	}

	public void setMaHang(String maHang) {
		this.maHang = maHang;
	}

	public Date getNgayNhap() {
		return ngayNhap;
	}

	public void setNgayNhap(Date ngayNhap) {
		this.ngayNhap = ngayNhap;
	}

	public int getDonGia() {
		return donGia;
	}

	public void setDonGia(int donGia) {
		this.donGia = donGia;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public double ThanhTien()
	{
		return this.donGia*this.soLuong;
	}
	

}
