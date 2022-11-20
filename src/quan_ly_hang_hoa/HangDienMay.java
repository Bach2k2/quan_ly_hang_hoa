package quan_ly_hang_hoa;

import java.sql.Date;

public class HangDienMay extends HangHoa{
	private String noiSanXuat;

	
	public HangDienMay() {
		super();
	}


	public HangDienMay(String noiSanXuat) {
		super();
		this.noiSanXuat = noiSanXuat;
	}


	public HangDienMay(String maHang, Date ngayNhap, int donGia, int soLuong,String noiSanXuat) {
		super(maHang, ngayNhap, donGia, soLuong);
		// TODO Auto-generated constructor stub
		this.noiSanXuat = noiSanXuat;
	}


	public String getNoiSanXuat() {
		return noiSanXuat;
	}


	public void setNoiSanXuat(String noiSanXuat) {
		this.noiSanXuat = noiSanXuat;
	}
	 
	@Override
	public double ThanhTien()
	{
		if(noiSanXuat.equals("NK"))
		{
			return getDonGia()*getSoLuong()*120/100;
		}else if (noiSanXuat.equals("TN")){
			return getDonGia()*getSoLuong(); // Ghi cho rõ, có thể gộp
		}else {
			return getDonGia()*getSoLuong();
		}
	}

	// Ham in ko the static 
	public String toString() {
		// TODO Auto-generated method stub
		return  this.getMaHang() + " " + this.getNgayNhap()+ " " + this.getDonGia() + " "
		+ this.getSoLuong() + " " + noiSanXuat;
	}
	
}
