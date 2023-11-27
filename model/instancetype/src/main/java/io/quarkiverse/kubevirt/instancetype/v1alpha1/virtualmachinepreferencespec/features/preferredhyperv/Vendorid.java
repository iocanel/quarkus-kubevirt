package io.quarkiverse.kubevirt.instancetype.v1alpha1.virtualmachinepreferencespec.features.preferredhyperv;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "enabled", "vendorid" })
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
public class Vendorid implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Enabled determines if the feature should be enabled or disabled on the guest. Defaults to true.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enabled")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Enabled determines if the feature should be enabled or disabled on the guest. Defaults to true.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean enabled;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * VendorID sets the hypervisor vendor id, visible to the vmi. String up to twelve characters.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vendorid")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("VendorID sets the hypervisor vendor id, visible to the vmi. String up to twelve characters.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String vendorid;

    public String getVendorid() {
        return vendorid;
    }

    public void setVendorid(String vendorid) {
        this.vendorid = vendorid;
    }
}
