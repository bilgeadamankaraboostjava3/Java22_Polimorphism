package com.muhammet;

import com.muhammet.entity.BuyukbasBakici;
import com.muhammet.entity.KucukbasBakici;
import com.muhammet.entity.KumesBakici;
import com.muhammet.entity.ToprakAgasi;

public class Runner {

	public static void main(String[] args) {
	
		/**
		 * 1. Aða herkese tek tek emir veriyor.
		 */
		ToprakAgasi aga = new ToprakAgasi();
		aga.Besle("09:00");
		KucukbasBakici kb = new KucukbasBakici();
		kb.Besle("09:00");
		BuyukbasBakici bb = new BuyukbasBakici();
		bb.Besle("09:00");
		KumesBakici kmb = new KumesBakici();
		kmb.Besle("09:00");
		System.out.println("-----------------------------------");
		/**
		 * 2. durum genel emir. 
		 */
		ToprakAgasi aga2 = new KucukbasBakici(); // ?????
		aga2.Besle("08:30");
		aga2 = new KumesBakici();
		aga2.Besle("08:30");
		aga2 = new BuyukbasBakici();
		aga2.Besle("08:30");
	}

}
