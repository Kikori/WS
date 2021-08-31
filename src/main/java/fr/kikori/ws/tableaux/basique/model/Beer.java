package fr.kikori.ws.tableaux.basique.model;

/**
 * Model of a beer.
 */
public class Beer {

    /**
     * technical id.
     */
    private long id;

    /**
     * name of the beer.
     */
    private String name;

    /**
     * brewer of the beer.
     */
    private String brewer;

    /**
     * colour.
     */
    private String colour;

    /**
     * alcohol by volume.
     */
    private String abv;

    /**
     * bottle size in liter.
     */
    private String bottleSize;

    /**
     * date of start of production.
     */
    private String producedSince;

    /**
     * Instantiates a new Beer.
     */
    public Beer() {
    }

    /**
     * Instantiates a new Beer.
     *
     * @param id            the id
     * @param name          the name
     * @param brewer        the brewer
     * @param colour        the colour
     * @param abv           the abv
     * @param bottleSize    the bottle size
     * @param producedSince the produced since
     */
    public Beer(long id, String name, String brewer, String colour, String abv, String bottleSize, String producedSince) {
        this.id = id;
        this.name = name;
        this.brewer = brewer;
        this.colour = colour;
        this.abv = abv;
        this.bottleSize = bottleSize;
        this.producedSince = producedSince;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets brewer.
     *
     * @return the brewer
     */
    public String getBrewer() {
        return brewer;
    }

    /**
     * Sets brewer.
     *
     * @param brewer the brewer
     */
    public void setBrewer(String brewer) {
        this.brewer = brewer;
    }

    /**
     * Gets colour.
     *
     * @return the colour
     */
    public String getColour() {
        return colour;
    }

    /**
     * Sets colour.
     *
     * @param colour the colour
     */
    public void setColour(String colour) {
        this.colour = colour;
    }

    /**
     * Gets abv.
     *
     * @return the abv
     */
    public String getAbv() {
        return abv;
    }

    /**
     * Sets abv.
     *
     * @param abv the abv
     */
    public void setAbv(String abv) {
        this.abv = abv;
    }

    /**
     * Gets bottle size.
     *
     * @return the bottle size
     */
    public String getBottleSize() {
        return bottleSize;
    }

    /**
     * Sets bottle size.
     *
     * @param bottleSize the bottle size
     */
    public void setBottleSize(String bottleSize) {
        this.bottleSize = bottleSize;
    }

    /**
     * Gets produced since.
     *
     * @return the produced since
     */
    public String getProducedSince() {
        return producedSince;
    }

    /**
     * Sets produced since.
     *
     * @param producedSince the produced since
     */
    public void setProducedSince(String producedSince) {
        this.producedSince = producedSince;
    }

    @Override
    public String toString() {
        return "Beer{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", brewer='" + brewer + '\'' +
            ", colour='" + colour + '\'' +
            ", abv='" + abv + '\'' +
            ", bottleSize='" + bottleSize + '\'' +
            ", producedSince='" + producedSince + '\'' +
            '}';
    }
}
