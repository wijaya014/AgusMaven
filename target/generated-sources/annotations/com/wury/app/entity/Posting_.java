package com.wury.app.entity;

import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Posting.class)
public abstract class Posting_ {

	public static volatile SingularAttribute<Posting, Integer> idAuthor;
	public static volatile SingularAttribute<Posting, Integer> id;
	public static volatile SingularAttribute<Posting, Date> tanggal;
	public static volatile SingularAttribute<Posting, String> judulPost;
	public static volatile SingularAttribute<Posting, String> isi;

}

