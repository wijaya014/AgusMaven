package com.wury.app.entity;

import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Komentar.class)
public abstract class Komentar_ {

	public static volatile SingularAttribute<Komentar, String> pengirim;
	public static volatile SingularAttribute<Komentar, Integer> idPosting;
	public static volatile SingularAttribute<Komentar, Integer> id;
	public static volatile SingularAttribute<Komentar, Date> tanggal;
	public static volatile SingularAttribute<Komentar, String> isi;

}

