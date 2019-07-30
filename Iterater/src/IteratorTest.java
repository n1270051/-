public class IteratorTest {
public static void main(String[] args) {
BookListAggregate bookListAggregate = new BookListAggregate();
Iterator iterator = bookListAggregate.createIterator();
bookListAggregate.add(new Book("マッチ売りの少女", 700));
bookListAggregate.add(new Book("赤ずきん", 700));
bookListAggregate.add(new Book("鏡の国のアリス", 700));
bookListAggregate.add(new Book("ハーメルンの笛吹き男", 700));

iterator.first(); // まず探す場所を先頭位置にしてもらう
while ( ! iterator.isDone() ) { // まだある？ まだあるよ！
Book book = (Book)iterator.getItem(); // はいどうぞ (と受取る)
System.out.println(book.getName());
iterator.next(); // 次を頂戴
}
}
}