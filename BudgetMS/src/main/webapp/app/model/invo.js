Ext.define("model.invo", {
	extend : "Ext.data.Model",
	feilds : [ {
		name : "invoId",
		type : "auto"
	}, {
		name : 'contPaymentId',
		type : 'int'
	}, {
		name : 'invoAmt',
		type : 'float'
	}, {
		name : 'invoCompany',
		type : 'auto'
	}, {
		name : 'transDate',
		type : 'date'
	}, {
		name : 'transfered',
		type : 'int',
	}, {
		name : 'optDate',
		type : 'date'
	}, {
		name : 'optUser',
		type : 'auto'
	}, {
		name : 'remark',
		type : 'auto'
	} ]
});