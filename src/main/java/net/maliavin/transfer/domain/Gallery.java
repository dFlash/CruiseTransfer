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
@Table(name = "public.gallery")
public class Gallery
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,
            generator = "gallery_gallery_id_seq")
    @SequenceGenerator(name = "gallery_gallery_id_seq",
            sequenceName = "gallery_gallery_id_seq")
    @Column(name = "gallery_id", nullable = false)
    private Long galleryId;

    @Column(name = "name")
    @Size(min = 1, max = 256)
    private String name;

    @Column(name = "default_file_id")
    private Long defaultFileInfoId;

    public Long getGalleryId()
    {
        return galleryId;
    }

    public void setGalleryId(Long galleryId)
    {
        this.galleryId = galleryId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Long getDefaultFileInfoId()
    {
        return defaultFileInfoId;
    }

    public void setDefaultFileInfoId(Long defaultFileInfoId)
    {
        this.defaultFileInfoId = defaultFileInfoId;
    }

    @Override
    public String toString()
    {
        return "Gallery [galleryId=" + galleryId + ", name=" + name
                + ", defaultFileInfoId=" + defaultFileInfoId + "]";
    }
    
    

}
