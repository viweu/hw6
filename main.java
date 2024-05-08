public class Main {

    public static void main(String[] args) {
        
        GenealogicalTreeModel model = new GenealogicalTree();

        GenealogicalTreeView view = new GenealogicalTreeViewImpl();

        GenealogicalTreePresenter presenter = new GenealogicalTreePresenter(model, view);

        presenter.loadPeople();

        presenter.sortBy(Comparator.comparing(Person::getName));
    }
}
