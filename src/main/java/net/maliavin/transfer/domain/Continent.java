package net.maliavin.transfer.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
@Table(name = "public.continent")
public class Continent
{
    @Id
    @Column(name = "continent_id", nullable = false)
    private Long continentId;

    @Column(name = "name")
    @Size(min = 1, max = 256)
    private String name;

    @Column(name = "description")
    @Size(max = 65536)
    private String description;

    @Column(name = "gallery_id")
    @NotFound(action = NotFoundAction.IGNORE)
    private Long galleryId;

    public Long getContinentId()
    {
        return continentId;
    }

    public void setContinentId(Long continentId)
    {
        this.continentId = continentId;
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
        return "Continent [continentId=" + continentId + ", name=" + name
                + ", description=" + description + ", galleryId=" + galleryId
                + "]";
    }
}
