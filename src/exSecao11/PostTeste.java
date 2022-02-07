package exSecao11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class PostTeste {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		Comment c1 = new Comment("Tenha uma boa viajem.");
		Comment c2 = new Comment("Que legal!");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		System.out.println("Titulo do Post: ");
		String titulo = sc.next();
		System.out.println("Quantidade de likes: ");
		int like = sc.nextInt();
		System.out.println("Descrição post: ");
		String desc = sc.next();
		
		Post post = new Post(sdf.parse("31/01/2022 15:04:01"), titulo, desc, like);
		
		post.addComment(c1);
		post.addComment(c2);
		
		System.out.println(post);
		
	}

}
