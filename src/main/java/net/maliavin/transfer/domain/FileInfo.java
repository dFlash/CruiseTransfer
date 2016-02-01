package net.maliavin.transfer.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "public.file")
public class FileInfo
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,
            generator = "file_file_id_seq")
    @SequenceGenerator(name = "file_file_id_seq",
            sequenceName = "file_file_id_seq")
    @Column(name = "file_id", nullable = false)
    private Long fileInfoId;

    @Column(name = "name")
    @Size(min = 1, max = 256)
    private String name;

    @Column(name = "original_name")
    @Size(min = 1, max = 256)
    private String originalName;

    @Column(name = "content_type")
    @Size(min = 1, max = 256)
    private String contentType;

    @Column(name = "gallery_id")
    @NotNull
    private Long galleryId;
    
    @Column(name = "content", nullable = false)
    @Lob
    @Type(type="org.hibernate.type.BinaryType")
    @NotNull
    private byte[] content;
    
    @Column(name = "thumbnail", nullable = false)
    @Lob
    @Type(type="org.hibernate.type.BinaryType")
    @NotNull
    private byte[] thumbnail;

    public Long getFileInfoId()
    {
        return fileInfoId;
    }

    public void setFileInfoId(Long fileInfoId)
    {
        this.fileInfoId = fileInfoId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getOriginalName()
    {
        return originalName;
    }

    public void setOriginalName(String originalName)
    {
        this.originalName = originalName;
    }

    public String getContentType()
    {
        return contentType;
    }

    public void setContentType(String contentType)
    {
        this.contentType = contentType;
    }

    public Long getGalleryId()
    {
        return galleryId;
    }

    public void setGalleryId(Long galleryId)
    {
        this.galleryId = galleryId;
    }

    public byte[] getContent()
    {
        return content;
    }

    public void setContent(byte[] content)
    {
        this.content = content;
    }

    public byte[] getThumbnail()
    {
        return thumbnail;
    }

    public void setThumbnail(byte[] thumbnail)
    {
        this.thumbnail = thumbnail;
    }

    @Override
    public String toString()
    {
        return "FileInfo [fileInfoId=" + fileInfoId + ", name=" + name
                + ", originalName=" + originalName + ", contentType="
                + contentType + ", galleryId=" + galleryId + "]";
    }
}
