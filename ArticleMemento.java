public final class ArticleMemento 
{
    private final long id;
    private final String titre;
    private final String contenu;
     
    public ArticleMemento(long id, String titre, String contenu) {
        super();
        this.id = id;
        this.titre = titre;
        this.contenu = contenu;
    }
 
    public long getId() {
        return id;
    }
 
    public String getTitre() {
        return titre;
    }
 
    public String getContenu() {
        return contenu;
    }
}