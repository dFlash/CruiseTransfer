package net.maliavin.transfer.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "public.country")
public class Country
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,
            generator = "country_country_id_seq")
    @SequenceGenerator(name = "country_country_id_seq",
            sequenceName = "country_country_id_seq")
    @Column(name = "country_id", nullable = false)
    private Long countryId;

    @Column(name = "name")
    @Size(min = 1, max = 256)
    private String name;

    @Column(name = "description")
    @Size(max = 65536)
    private String description;

    @Column(name = "gallery_id")
    private Long galleryId;

    public Long getCountryId()
    {
        return countryId;
    }

    public void setCountryId(Long countryId)
    {
        this.countryId = countryId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public Long getGalleryId()
    {
        return galleryId;
    }

    public void setGalleryId(Long galleryId)
    {
        this.galleryId = galleryId;
    }

    @Override
    public String toString()
    {
        return "Country [countryId=" + countryId + ", name=" + name
                + ", description=" + description + ", galleryId=" + galleryId
                + "]";
    }
    
    
}
