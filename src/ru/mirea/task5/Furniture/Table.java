package ru.mirea.task5.Furniture;

public class Table extends Furniture {

    private final Material material;

    public Table(Material material) {
        super(100, 50, 30);
        this.material = material;
    }

    @Override
    public Material getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "Table{" +
                "super=" + super.toString() +
                ", material=" + material +
                '}';
    }
}
