package net.maliavin.transfer.domain;

public class FileInfo
{
    private Long fileInfoId;

    private String name;

    private String originalName;

    private String contentType;

    private Long galleryId;
    
    private byte[] content;

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
