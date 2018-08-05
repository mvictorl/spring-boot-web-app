<#import "elements/common.ftl" as c>
<#import "/spring.ftl" as spring>

<@c.page>
<h5>Employees</h5>

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
            <a class="dropdown-item" href="/employee/filial/${fil.id}">${fil.shortName}</a>
        </#list>
    </div>
</div>

<#if filial??>
    <div class="btn-group">
        <button type="button" class="btn btn-sm btn-secondary dropdown-toggle dropdown-toggle-split" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
        <#if division??>
            ${division.shortName}
        <#else>
            <@spring.message "label.choose.filial" />...
        </#if>
        </button>
        <div class="dropdown-menu">
        <#list divisions as dvs>
            <a class="dropdown-item" href="/employee/filial/${filial.id}/division/${dvs.id}">${dvs.shortName}</a>
        </#list>
        </div>
    </div>
    <#if employees??>
        <#list employees as empl>
            <div>
                <b>${empl.id}</b>
                <i>${empl.shortName}</i>
            </div>
        </#list>
    <#else>
        Список подразделений не найден
    </#if>
<#else>
    Филиал не выбран
</#if>
</@c.page>