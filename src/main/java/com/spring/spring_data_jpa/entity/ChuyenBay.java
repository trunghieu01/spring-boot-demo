package com.spring.spring_data_jpa.entity;

import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "chuyenbay")
public class ChuyenBay {
	@Id
	private String macb;
	private String gadi, gaden;
	private int dodai, chiphi;
	private Time giodi, gioden;
	public String getMacb() {
		return macb;
	}
	public void setMacb(String macb) {
		this.macb = macb;
	}
	public String getGadi() {
		return gadi;
	}
	public void setGadi(String gadi) {
		this.gadi = gadi;
	}
	public String getGaden() {
		return gaden;
	}
	public void setGaden(String gaden) {
		this.gaden = gaden;
	}
	public int getDodai() {
		return dodai;
	}
	public void setDodai(int dodai) {
		this.dodai = dodai;
	}
	public int getChiphi() {
		return chiphi;
	}
	public void setChiphi(int chiphi) {
		this.chiphi = chiphi;
	}
	public Time getGiodi() {
		return giodi;
	}
	public void setGiodi(Time giodi) {
		this.giodi = giodi;
	}
	public Time getGioden() {
		return gioden;
	}
	public void setGioden(Time gioden) {
		this.gioden = gioden;
	}
	
}
