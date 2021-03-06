package org.hfly.app.persondisk.domain;

import java.io.Serializable;

public class Permisson implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column d_permission.pid
     *
     * @mbg.generated
     */
    private Integer pid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column d_permission.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column d_permission.maxFile
     *
     * @mbg.generated
     */
    private Integer maxfile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column d_permission.maxSize
     *
     * @mbg.generated
     */
    private Long maxsize;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table d_permission
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column d_permission.pid
     *
     * @return the value of d_permission.pid
     *
     * @mbg.generated
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column d_permission.pid
     *
     * @param pid the value for d_permission.pid
     *
     * @mbg.generated
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column d_permission.name
     *
     * @return the value of d_permission.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column d_permission.name
     *
     * @param name the value for d_permission.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column d_permission.maxFile
     *
     * @return the value of d_permission.maxFile
     *
     * @mbg.generated
     */
    public Integer getMaxfile() {
        return maxfile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column d_permission.maxFile
     *
     * @param maxfile the value for d_permission.maxFile
     *
     * @mbg.generated
     */
    public void setMaxfile(Integer maxfile) {
        this.maxfile = maxfile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column d_permission.maxSize
     *
     * @return the value of d_permission.maxSize
     *
     * @mbg.generated
     */
    public Long getMaxsize() {
        return maxsize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column d_permission.maxSize
     *
     * @param maxsize the value for d_permission.maxSize
     *
     * @mbg.generated
     */
    public void setMaxsize(Long maxsize) {
        this.maxsize = maxsize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table d_permission
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Permisson other = (Permisson) that;
        return (this.getPid() == null ? other.getPid() == null : this.getPid().equals(other.getPid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getMaxfile() == null ? other.getMaxfile() == null : this.getMaxfile().equals(other.getMaxfile()))
            && (this.getMaxsize() == null ? other.getMaxsize() == null : this.getMaxsize().equals(other.getMaxsize()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table d_permission
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPid() == null) ? 0 : getPid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getMaxfile() == null) ? 0 : getMaxfile().hashCode());
        result = prime * result + ((getMaxsize() == null) ? 0 : getMaxsize().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table d_permission
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pid=").append(pid);
        sb.append(", name=").append(name);
        sb.append(", maxfile=").append(maxfile);
        sb.append(", maxsize=").append(maxsize);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}