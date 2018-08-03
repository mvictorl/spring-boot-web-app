<#import "elements/common.ftl" as c>
<#import "elements/login_form.ftl" as l>
<#import "/spring.ftl" as spring>

<@c.page>
<h5 class="mb-3"><@spring.message "label.add_new_user" /></h5>
    ${message?ifExists}
    <@l.login "/registration" true />
</@c.page>