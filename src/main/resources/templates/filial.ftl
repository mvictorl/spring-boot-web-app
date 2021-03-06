<#import "elements/common.ftl" as c>
<#import "/spring.ftl" as spring>

<@c.page>
<h5>Filials</h5>

<div class="btn-group">
    <button type="button" class="btn btn-sm btn-secondary dropdown-toggle dropdown-toggle-split" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
        <#if filial??>
            ${filial.shortName}
        <#else>
            <@spring.message "label.choose.filial" />...
        </#if>
    </button>
    <div class="dropdown-menu">
        <#list filials as fil>
            <a class="dropdown-item" href="/filial/${fil.id}">${fil.shortName}</a>
        </#list>
    </div>
</div>
</@c.page>