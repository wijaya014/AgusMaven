package com.wury.app.entity;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Author.class)
public abstract class Author_ {

	public static volatile SingularAttribute<Author, String> webSite;
	public static volatile SingularAttribute<Author, String> password;
	public static volatile SingularAttribute<Author, String> namaAuthor;
	public static volatile SingularAttribute<Author, Integer> id;
	public static volatile SingularAttribute<Author, String> email;
	public static volatile SingularAttribute<Author, String> username;

}

