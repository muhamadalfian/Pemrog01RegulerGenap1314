// Created By Muhammad Alfian Nur
// Update : 19 Mei 2014
package praktikum08a.bin;
import java.math.BigDecimal;

public class Barang
{
	private String kode;
	private String nama;
	private BigDecimal harga;
	
	public String getKode()
	{
		return kode;
	}
	public void setKode (String x)
	{
		kode = x;
	}
	public String getNama()
	{
		return nama;
	}
	public void setNama (String x)
	{
		nama = x;
	}
	public BigDecimal getHarga()
	{
		return harga;
	}
	public void setHarga (BigDecimal x)
	{
		harga = x;
	}
}