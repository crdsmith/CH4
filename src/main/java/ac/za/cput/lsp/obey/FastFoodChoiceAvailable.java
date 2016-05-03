package ac.za.cput.lsp.obey;

/**
 *
 */
public class FastFoodChoiceAvailable extends FastFoodSuperSizeAvailable {
    @Override
    public Boolean superSizeDrink() {
        return true;
    }

    @Override
    public Boolean superSizeFries() {
        return true;
    }
}
