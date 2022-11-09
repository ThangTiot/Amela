<form action="/customers" method="get">
<fieldset>
    <legend>Customer Information</legend>
    <table>
        <tr>
            <td>Id</td>
            <td>
                ${customer.id}
            </td>
        </tr>
        <tr>
            <td>Name</td>
            <td>
                ${customer.name}
            </td>
        </tr>
        <tr>
            <td>Email</td>
            <td>
                ${customer.email}
            </td>
        </tr>
        <tr>
            <td>Address</td>
            <td>
                ${customer.address}
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Back to list">
            </td>
        </tr>
    </table>
</fieldset>
</form>
