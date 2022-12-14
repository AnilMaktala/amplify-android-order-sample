package com.amplifyframework.datastore.generated.model;

import com.amplifyframework.core.model.annotations.HasMany;
import com.amplifyframework.core.model.temporal.Temporal;

import java.util.List;
import java.util.UUID;
import java.util.Objects;

import androidx.core.util.ObjectsCompat;

import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;

import static com.amplifyframework.core.model.query.predicate.QueryField.field;

/** This is an auto generated class representing the Customer type in your schema. */
@SuppressWarnings("all")
@ModelConfig(pluralName = "Customers")
@Index(name = "byRepresentative", fields = {"accountRepresentativeID","id"})
public final class Customer implements Model {
  public static final QueryField ID = field("Customer", "id");
  public static final QueryField NAME = field("Customer", "name");
  public static final QueryField PHONE_NUMBER = field("Customer", "phoneNumber");
  public static final QueryField ACCOUNT_REPRESENTATIVE_ID = field("Customer", "accountRepresentativeID");
  private final @ModelField(targetType="ID", isRequired = true) String id;
  private final @ModelField(targetType="String", isRequired = true) String name;
  private final @ModelField(targetType="String") String phoneNumber;
  private final @ModelField(targetType="Address") @HasMany(associatedWith = "customerID", type = Address.class) List<Address> address = null;
  private final @ModelField(targetType="ID", isRequired = true) String accountRepresentativeID;
  private final @ModelField(targetType="Order") @HasMany(associatedWith = "customerID", type = Order.class) List<Order> ordersByDate = null;
  private final @ModelField(targetType="Order") @HasMany(associatedWith = "customerID", type = Order.class) List<Order> ordersByStatusDate = null;
  private @ModelField(targetType="AWSDateTime", isReadOnly = true) Temporal.DateTime createdAt;
  private @ModelField(targetType="AWSDateTime", isReadOnly = true) Temporal.DateTime updatedAt;
  public String getId() {
      return id;
  }
  
  public String getName() {
      return name;
  }
  
  public String getPhoneNumber() {
      return phoneNumber;
  }
  
  public List<Address> getAddress() {
      return address;
  }
  
  public String getAccountRepresentativeId() {
      return accountRepresentativeID;
  }
  
  public List<Order> getOrdersByDate() {
      return ordersByDate;
  }
  
  public List<Order> getOrdersByStatusDate() {
      return ordersByStatusDate;
  }
  
  public Temporal.DateTime getCreatedAt() {
      return createdAt;
  }
  
  public Temporal.DateTime getUpdatedAt() {
      return updatedAt;
  }
  
  private Customer(String id, String name, String phoneNumber, String accountRepresentativeID) {
    this.id = id;
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.accountRepresentativeID = accountRepresentativeID;
  }
  
  @Override
   public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if(obj == null || getClass() != obj.getClass()) {
        return false;
      } else {
      Customer customer = (Customer) obj;
      return ObjectsCompat.equals(getId(), customer.getId()) &&
              ObjectsCompat.equals(getName(), customer.getName()) &&
              ObjectsCompat.equals(getPhoneNumber(), customer.getPhoneNumber()) &&
              ObjectsCompat.equals(getAccountRepresentativeId(), customer.getAccountRepresentativeId()) &&
              ObjectsCompat.equals(getCreatedAt(), customer.getCreatedAt()) &&
              ObjectsCompat.equals(getUpdatedAt(), customer.getUpdatedAt());
      }
  }
  
  @Override
   public int hashCode() {
    return new StringBuilder()
      .append(getId())
      .append(getName())
      .append(getPhoneNumber())
      .append(getAccountRepresentativeId())
      .append(getCreatedAt())
      .append(getUpdatedAt())
      .toString()
      .hashCode();
  }
  
  @Override
   public String toString() {
    return new StringBuilder()
      .append("Customer {")
      .append("id=" + String.valueOf(getId()) + ", ")
      .append("name=" + String.valueOf(getName()) + ", ")
      .append("phoneNumber=" + String.valueOf(getPhoneNumber()) + ", ")
      .append("accountRepresentativeID=" + String.valueOf(getAccountRepresentativeId()) + ", ")
      .append("createdAt=" + String.valueOf(getCreatedAt()) + ", ")
      .append("updatedAt=" + String.valueOf(getUpdatedAt()))
      .append("}")
      .toString();
  }
  
  public static NameStep builder() {
      return new Builder();
  }
  
  /**
   * WARNING: This method should not be used to build an instance of this object for a CREATE mutation.
   * This is a convenience method to return an instance of the object with only its ID populated
   * to be used in the context of a parameter in a delete mutation or referencing a foreign key
   * in a relationship.
   * @param id the id of the existing item this instance will represent
   * @return an instance of this model with only ID populated
   */
  public static Customer justId(String id) {
    return new Customer(
      id,
      null,
      null,
      null
    );
  }
  
  public CopyOfBuilder copyOfBuilder() {
    return new CopyOfBuilder(id,
      name,
      phoneNumber,
      accountRepresentativeID);
  }
  public interface NameStep {
    AccountRepresentativeIdStep name(String name);
  }
  

  public interface AccountRepresentativeIdStep {
    BuildStep accountRepresentativeId(String accountRepresentativeId);
  }
  

  public interface BuildStep {
    Customer build();
    BuildStep id(String id);
    BuildStep phoneNumber(String phoneNumber);
  }
  

  public static class Builder implements NameStep, AccountRepresentativeIdStep, BuildStep {
    private String id;
    private String name;
    private String accountRepresentativeID;
    private String phoneNumber;
    @Override
     public Customer build() {
        String id = this.id != null ? this.id : UUID.randomUUID().toString();
        
        return new Customer(
          id,
          name,
          phoneNumber,
          accountRepresentativeID);
    }
    
    @Override
     public AccountRepresentativeIdStep name(String name) {
        Objects.requireNonNull(name);
        this.name = name;
        return this;
    }
    
    @Override
     public BuildStep accountRepresentativeId(String accountRepresentativeId) {
        Objects.requireNonNull(accountRepresentativeId);
        this.accountRepresentativeID = accountRepresentativeId;
        return this;
    }
    
    @Override
     public BuildStep phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    
    /**
     * @param id id
     * @return Current Builder instance, for fluent method chaining
     */
    public BuildStep id(String id) {
        this.id = id;
        return this;
    }
  }
  

  public final class CopyOfBuilder extends Builder {
    private CopyOfBuilder(String id, String name, String phoneNumber, String accountRepresentativeId) {
      super.id(id);
      super.name(name)
        .accountRepresentativeId(accountRepresentativeId)
        .phoneNumber(phoneNumber);
    }
    
    @Override
     public CopyOfBuilder name(String name) {
      return (CopyOfBuilder) super.name(name);
    }
    
    @Override
     public CopyOfBuilder accountRepresentativeId(String accountRepresentativeId) {
      return (CopyOfBuilder) super.accountRepresentativeId(accountRepresentativeId);
    }
    
    @Override
     public CopyOfBuilder phoneNumber(String phoneNumber) {
      return (CopyOfBuilder) super.phoneNumber(phoneNumber);
    }
  }
  
}
