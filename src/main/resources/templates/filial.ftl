<#import "elements/common.ftl" as c>

<@c.page>
<h5>Filials</h5>
<div class="dropdown">
    <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
        Dropdown button
    </button>
    <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
        <#list filials as filial>
            <a class="dropdown-item" href="/filial/${filial.id}">${filial.shortName}</a>
        </#list>
    </div>
    <#if filial??>
        <div>
            <i>${filial.id}</i>
            <b>${filial.fullName}</b>
        </div>
    </#if>
</div>
</@c.page>