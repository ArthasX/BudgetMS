Ext.define("model.cont", {
	extend : "Ext.data.Model",
	feilds : [ {
		name : "contId",
		type : "auto"
	}, {
		name : 'instDivideId',
		type : 'int'
	}, {
		name : 'contName',
		type : 'auto'
	}, {
		name : 'contAmt',
		type : 'float'
	}, {
		name : 'contType',
		type : 'int'
	}, {
		name : 'signedDate',
		type : 'date',
	}, {
		name : 'signedPerson',
		type : 'auto'
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
