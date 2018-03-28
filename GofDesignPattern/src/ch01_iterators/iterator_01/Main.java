package ch01_iterators.iterator_01;

public class Main {

	public static void main(String[] args) {

		BookShelf bookshelf = new BookShelf(4);
		bookshelf.appendBook(new Book("Arround the World in 80Days"));
		bookshelf.appendBook(new Book("Bible"));
		bookshelf.appendBook(new Book("Cinderella"));
		bookshelf.appendBook(new Book("Daddy-Long-legs"));

		Iterator it = bookshelf.iterator();

		while (it.hasNext()) {
			Book book;
			Object  tmpObj = it.next() ;
			if (tmpObj instanceof Book) {
				book = (Book) tmpObj;
				System.out.println(book.getName());
			}
		}
	}
}
