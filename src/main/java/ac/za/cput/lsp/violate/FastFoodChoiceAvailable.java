package ac.za.cput.lsp.violate;

/**
 *
 */
public class FastFoodChoiceAvailable extends FastFoodSuperSizeAvailable {
    @Override
    public Boolean superSizeDrink() {
        return false;
    }

    @Override
    public Boolean superSizeFries() {
        return super.superSizeFries();
    }
}
