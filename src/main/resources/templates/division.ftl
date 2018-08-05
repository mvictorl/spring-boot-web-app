<#import "elements/common.ftl" as c>
<#import "/spring.ftl" as spring>

<@c.page>
<h5>Divisions</h5>

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
            <a class="dropdown-item" href="/division/filial/${fil.id}">${fil.shortName}</a>
        </#list>
    </div>
</div>

<#if filial??>
    <#if divisions??>
        <#list divisions as dvs>
            <div>
                <b>${dvs.id}</b>
                <i>${dvs.shortName}</i>
            </div>
        </#list>
    <#else>
        Список подразделений не найден
    </#if>
<#else>
    Филиал не выбран
</#if>
</@c.page>