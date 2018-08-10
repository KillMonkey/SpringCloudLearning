package com.forezp.servicehi.entity;

public class User 
{
    private String id;
    
    private String name;
    
    private String phone;
    
    private int sex;
    
    private String address;
    
    private float salary;
    
    private boolean idAdmin;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public boolean isIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(boolean idAdmin) {
        this.idAdmin = idAdmin;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", phone=" + phone + ", sex=" + sex + ", address="
                + address + ", salary=" + salary + ", idAdmin=" + idAdmin + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + (idAdmin ? 1231 : 1237);
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((phone == null) ? 0 : phone.hashCode());
        result = prime * result + Float.floatToIntBits(salary);
        result = prime * result + sex;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (address == null) {
            if (other.address != null)
                return false;
        } else if (!address.equals(other.address))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (idAdmin != other.idAdmin)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (phone == null) {
            if (other.phone != null)
                return false;
        } else if (!phone.equals(other.phone))
            return false;
        if (Float.floatToIntBits(salary) != Float.floatToIntBits(other.salary))
            return false;
        if (sex != other.sex)
            return false;
        return true;
    }
}
