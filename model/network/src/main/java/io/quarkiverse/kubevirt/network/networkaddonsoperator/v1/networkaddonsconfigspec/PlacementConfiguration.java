package io.quarkiverse.kubevirt.network.networkaddonsoperator.v1.networkaddonsconfigspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "infra", "workloads" })
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
public class PlacementConfiguration implements io.fabric8.kubernetes.api.model.KubernetesResource {

  /**
   * Infra defines placement configuration for control-plane nodes
   */
  @com.fasterxml.jackson.annotation.JsonProperty("infra")
  @com.fasterxml.jackson.annotation.JsonPropertyDescription("Infra defines placement configuration for control-plane nodes")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.network.networkaddonsoperator.v1.networkaddonsconfigspec.placementconfiguration.Infra infra;

  public io.quarkiverse.kubevirt.network.networkaddonsoperator.v1.networkaddonsconfigspec.placementconfiguration.Infra getInfra() {
    return infra;
  }

  public void setInfra(
      io.quarkiverse.kubevirt.network.networkaddonsoperator.v1.networkaddonsconfigspec.placementconfiguration.Infra infra) {
    this.infra = infra;
  }

  @com.fasterxml.jackson.annotation.JsonProperty("workloads")
  @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
  private io.quarkiverse.kubevirt.network.networkaddonsoperator.v1.networkaddonsconfigspec.placementconfiguration.Workloads workloads;

  public io.quarkiverse.kubevirt.network.networkaddonsoperator.v1.networkaddonsconfigspec.placementconfiguration.Workloads getWorkloads() {
    return workloads;
  }

  public void setWorkloads(
      io.quarkiverse.kubevirt.network.networkaddonsoperator.v1.networkaddonsconfigspec.placementconfiguration.Workloads workloads) {
    this.workloads = workloads;
  }
}
