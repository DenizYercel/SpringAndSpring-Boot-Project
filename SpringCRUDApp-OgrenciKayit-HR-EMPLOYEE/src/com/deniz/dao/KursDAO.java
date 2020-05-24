package com.deniz.dao;

import java.util.List;


import com.deniz.entity.Kurs;
import com.deniz.entity.Ogretmen;

public interface KursDAO {
	
	public  List<Kurs> getKurslar();
	
	public void saveKurs(Kurs kurs);
	
	public Kurs getKurs(int kursId);
	
	public void deleteKurs(int kursId);
	
	public List<Ogretmen> getOgretmen();
	
	public List<Kurs> searchKurs(Kurs kurs);

}
