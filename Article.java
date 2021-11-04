public class Article 
{
    private long id;
    private String titre;
    private String contenu;
     
    public Article(long id, String titre) {
        super();
        this.id = id;
        this.titre = titre;
    }
     
     
    public ArticleMemento creerMemento() 
    {
        ArticleMemento m = new ArticleMemento(id, titre, contenu);
        return m;
    }
     
    public void restaurer(ArticleMemento m) {
        this.id = m.getId();
        this.titre = m.getTitre();
        this.contenu = m.getContenu();
    }
 
    public String toString() {
        return "Article [id=" + id + ", titre=" + titre + ", contenu=" + contenu + "]";
    }
}
