public class Main 
{
    public static void main(String[] args) 
    {
        Article article = new Article(1, "Mon Article");
        article.setContenu("Bonjour");      
        System.out.println(article);
         
        ArticleMemento memento = article.creerMemento();   
         
        article.setContenu("Bonsoir");     
        System.out.println(article);
         
        article.restaurer(memento);  
        System.out.println(article); 
    }
}
