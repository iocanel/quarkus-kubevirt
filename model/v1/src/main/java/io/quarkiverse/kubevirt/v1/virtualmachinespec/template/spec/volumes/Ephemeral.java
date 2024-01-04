package io.quarkiverse.kubevirt.v1.virtualmachinespec.template.spec.volumes;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "persistentVolumeClaim" })
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@lombok.ToString()
@lombok.EqualsAndHashCode()
@io.sundr.builder.annotations.Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ObjectMeta.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ObjectReference.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.LabelSelector.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.Container.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.EnvVar.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ContainerPort.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.Volume.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.VolumeMount.class)
})
public class Ephemeral implements io.fabric8.kubernetes.api.model.KubernetesResource {

  /**
   * PersistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace. Directly
   * attached to the vmi via qemu. More info:
   * https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
   */
  @com.fasterxml.jackson.annotation.JsonProperty("persistentVolumeClaim")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("PersistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace. Directly attached to the vmi via qemu. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.v1.virtualmachinespec.template.spec.volumes.ephemeral.PersistentVolumeClaim persistentVolumeClaim;

  public io.quarkiverse.kubevirt.v1.virtualmachinespec.template.spec.volumes.ephemeral.PersistentVolumeClaim getPersistentVolumeClaim() {
    return persistentVolumeClaim;
  }

  public void setPersistentVolumeClaim(
      io.quarkiverse.kubevirt.v1.virtualmachinespec.template.spec.volumes.ephemeral.PersistentVolumeClaim persistentVolumeClaim) {
    this.persistentVolumeClaim = persistentVolumeClaim;
  }

  @com.fasterxml.jackson.annotation.JsonIgnore()
  private java.util.Map<String, Object> additionalProperties = new java.util.HashMap<>();

  @com.fasterxml.jackson.annotation.JsonAnyGetter()
  public java.util.Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  @com.fasterxml.jackson.annotation.JsonAnySetter()
  public void setAdditionalProperties(java.util.Map<String, Object> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  @com.fasterxml.jackson.annotation.JsonAnySetter()
  public void setAdditionalProperty(java.lang.String key, java.lang.Object value) {
    this.additionalProperties.put(key, value);
  }
}
